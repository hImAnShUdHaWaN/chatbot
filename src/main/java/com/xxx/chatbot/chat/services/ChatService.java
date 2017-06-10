package com.xxx.chatbot.chat.services;

import com.xxx.chatbot.chat.domain.ChatMessage;

public interface ChatService {
    ChatMessage getResponse(String message);
}
