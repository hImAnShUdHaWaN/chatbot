package com.xxx.chatbot.util;

import com.xxx.chatbot.chat.domain.ChatMessage;
import com.xxx.chatbot.intent.domain.Intent;
import com.xxx.chatbot.intent.services.IntentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by himanshu dhawan on 09-06-2017.
 */
@Service
public class CacheMemory {

    @Autowired
    IntentService service;

    public ChatMessage get(String message){
        if("sell".equals(message)){
            Intent intent = service.findById("13bd6a06-2dcd-4c42-9980-f6c099908e15");
            return new ChatMessage(Randomizer.get(intent.getResponses().get(0).getMessages().get(0).getSpeech()));
        } else if ("buy".equals(message)){
            Intent intent = service.findById("65b00868-0466-4d8e-9ba3-1844db3ce26f");
            return new ChatMessage(Randomizer.get(intent.getResponses().get(0).getMessages().get(0).getSpeech()));
        } else{
            Intent intent = service.findById("385db5e6-c8a0-432b-a530-4fda5da3f764");
            return new ChatMessage(Randomizer.get(intent.getResponses().get(0).getMessages().get(0).getSpeech()));

        }
    }
}
