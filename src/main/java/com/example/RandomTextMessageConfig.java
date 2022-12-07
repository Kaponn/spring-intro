package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class RandomTextMessageConfig {
    @Bean
    @Scope("prototype")
    public RandomTextMessageService randomTextMessage() {
        return new RandomTextMessageService();
    }
}
