package com.example.replyserver.service;

import com.example.replyserver.config.GeminiProperties;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

@Service
public class OpenAIService {

    private static final Logger log = LoggerFactory.getLogger(OpenAIService.class);
    private static final String GEMINI_MODEL = "gemini-2.5-flash";

    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final String apiKey;

    public OpenAIService(GeminiProperties geminiProperties) {
        String fromProps = geminiProperties.getKey();
        this.apiKey = fromProps.isEmpty() ? (System.getenv("GEMINI_API_KEY") != null ? System.getenv("GEMINI_API_KEY") : "") : fromProps;
        log.info("OpenAIService 초기화 (Gemini) - API 키 로드: {} (길이: {})",
                this.apiKey.length() > 10 ? this.apiKey.substring(0, 10) + "..." : "(없음)", this.apiKey.length());
        if (this.apiKey.isEmpty()) {
            log.warn("gemini.api.key가 비어있음!");
        }
    }

    public Flux<String> streamChat(String prompt) {
        if (apiKey.isEmpty()) {
            log.error("API 키가 비어있음!");
            return Flux.error(new IllegalStateException("gemini.api.key가 설정되지 않았습니다."));
        }

        Map<String, Object> requestBody = Map.of(
                "contents", List.of(
                        Map.of("parts", List.of(Map.of("text", prompt)))
                )
        );

        // URL에 key 파라미터 + 헤더 둘 다 (일부 환경에서 헤더만으로 인식 안 됨)
        String url = "https://generativelanguage.googleapis.com/v1beta/models/"
                + GEMINI_MODEL
                + ":generateContent?key=" + apiKey;

        return Mono.fromCallable(() -> {
            String body = objectMapper.writeValueAsString(requestBody);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Content-Type", "application/json")
                    .header("x-goog-api-key", apiKey)
                    .POST(HttpRequest.BodyPublishers.ofString(body))
                    .build();

            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() >= 400) {
                throw new RuntimeException("Gemini API [" + response.statusCode() + "]: " + response.body());
            }
            return response.body();
        })
        .subscribeOn(Schedulers.boundedElastic())
        .flatMapMany(json -> {
            try {
                JsonNode root = objectMapper.readTree(json);
                String text = root.path("candidates").get(0).path("content").path("parts").get(0).path("text").asText();
                String wrapped = objectMapper.writeValueAsString(
                        Map.of("candidates", List.of(Map.of("content", Map.of("parts", List.of(Map.of("text", text)))))));
                return Flux.just(wrapped);
            } catch (Exception e) {
                return Flux.error(e);
            }
        });
    }
}
