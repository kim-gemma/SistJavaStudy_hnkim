package com.example.replyserver.config;

import com.example.replyserver.socket.ReplySocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private final ReplySocketHandler replySocketHandler;

    public WebSocketConfig(ReplySocketHandler replySocketHandler) {
        this.replySocketHandler = replySocketHandler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(replySocketHandler, "/ws/reply")
                .setAllowedOrigins("*");
    }
}
