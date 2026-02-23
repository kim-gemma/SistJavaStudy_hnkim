package com.example.replyserver.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "gemini.api")
public class GeminiProperties {

    private String key = "";

    public String getKey() {
        return key != null ? key.trim() : "";
    }

    public void setKey(String key) {
        this.key = key;
    }
}
