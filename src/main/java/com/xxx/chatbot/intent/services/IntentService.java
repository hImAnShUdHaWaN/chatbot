package com.xxx.chatbot.intent.services;

import com.xxx.chatbot.intent.domain.Intent;

import java.util.List;

public interface IntentService {

    Intent create(Intent intent);

    Intent delete(String id);

    List<Intent> findAll();

    Intent findById(String id);
}
