package com.example.replyserver.socket;

import com.example.replyserver.service.OpenAIService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import reactor.core.Disposable;

import java.util.Map;

@Component
public class ReplySocketHandler extends TextWebSocketHandler {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final OpenAIService openAIService;

    public ReplySocketHandler(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        System.out.println("WebSocket 연결됨: " + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        System.out.println("받은 메시지: " + message.getPayload());

        Map<String, Object> input =
                objectMapper.readValue(message.getPayload(), Map.class);

        String originalText = (String) input.get("originalText");

        // 1️⃣ 상태 전송
        session.sendMessage(new TextMessage(
                objectMapper.writeValueAsString(
                        Map.of("type", "STATUS", "step", "ANALYZING")
                )
        ));

        // 2️⃣ AI 스트리밍 시작 (Gemini API, 키는 서버 application.properties에서만 사용)
        Disposable subscription = openAIService.streamChat(originalText)
                .subscribe(
                        chunk -> {
                            try {
                                String json = chunk != null ? chunk.trim() : "";
                                if (json.isEmpty() || json.equals("[DONE]")) {
                                    session.sendMessage(new TextMessage(
                                            objectMapper.writeValueAsString(
                                                    Map.of("type", "STATUS", "step", "DONE")
                                            )
                                    ));
                                    return;
                                }

                                JsonNode node = objectMapper.readTree(json);
                                    // Gemini 형식: candidates[0].content.parts[0].text
                                    JsonNode candidates = node.path("candidates");
                                    if (!candidates.isMissingNode() && candidates.isArray() && candidates.size() > 0) {
                                        JsonNode contentNode = candidates.get(0)
                                                .path("content")
                                                .path("parts");
                                        if (contentNode.isArray() && contentNode.size() > 0) {
                                            JsonNode textNode = contentNode.get(0).path("text");
                                            if (!textNode.isMissingNode()) {
                                                String content = textNode.asText();
                                                if (!content.isEmpty()) {
                                                    session.sendMessage(new TextMessage(
                                                            objectMapper.writeValueAsString(
                                                                    Map.of("type", "STREAM", "chunk", content)
                                                            )
                                                    ));
                                                }
                                            }
                                        }
                                    }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        },
                        error -> {
                            String errMsg = error.getMessage();
                            if (errMsg == null) errMsg = error.getClass().getSimpleName();
                            System.err.println("[AI 오류] " + error.getClass().getSimpleName() + ": " + errMsg);
                            error.printStackTrace();
                            try {
                                session.sendMessage(new TextMessage(
                                        objectMapper.writeValueAsString(
                                                Map.of("type", "ERROR", "message", "AI 오류 발생", "detail", errMsg)
                                        )
                                ));
                            } catch (Exception ignored) {}
                        },
                        () -> {
                            try {
                                session.sendMessage(new TextMessage(
                                        objectMapper.writeValueAsString(
                                                Map.of("type", "STATUS", "step", "DONE")
                                        )
                                ));
                            } catch (Exception ignored) {}
                        }
                );
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        System.out.println("WebSocket 연결 종료");
    }
}