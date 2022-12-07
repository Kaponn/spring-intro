package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyNameMessageConfig {
    @Bean
    @Scope("prototype")
    public MyNameMessageService myNameMessage() {
        return new MyNameMessageService();
    }
}
