package com.xxx.chatbot.chat.controller;

import com.xxx.chatbot.chat.domain.ChatMessage;
import com.xxx.chatbot.chat.services.ChatService;
import com.xxx.chatbot.intelligence.DummyIntelligence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {

    private final ChatService service;

    @Autowired
    public ChatController(ChatService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    ChatMessage chatResponse(@RequestBody ChatMessage message) {
        String verb = DummyIntelligence.someTest(message.getMessage());
        return service.getResponse(verb);
    }

}
