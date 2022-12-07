package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.register(MyNameMessageConfig.class, RandomTextMessageConfig.class);
        applicationContext.refresh();

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);

        MessageService messageService2 = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());
    }
}
