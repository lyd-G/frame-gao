package com.frame.web.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "frame")
public class FrameConfig {
    private String zipPassword;
    private String redisPassword;

    @Override
    public String toString() {
        return "FrameConfig{" +
                "zipPassword='" + zipPassword + '\'' +
                ", redisPassword='" + redisPassword + '\'' +
                '}';
    }
}