package com.xxx.chatbot.chat.services;

import com.xxx.chatbot.chat.domain.ChatMessage;
import com.xxx.chatbot.util.CacheMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    CacheMemory cache;

    @Override
    public ChatMessage getResponse(String cMessage) {
        return cache.get(cMessage);
    }
}
