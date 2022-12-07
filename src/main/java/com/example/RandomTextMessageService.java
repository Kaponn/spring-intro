package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("messageService2")
public class RandomTextMessageService implements MessageService {
  String [] texts = {"cat", "dog", "horse", "picture", "wall", "lamp", "loop", "door", "weird", "man"};

  @Override
  public String getMessage() {
    int randomText = new Random().nextInt(texts.length);

    return texts[randomText];
}
}
