package com.xxx.chatbot.chat.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by himanshu dhawan on 09-06-2017.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatMessage {

    private String message;

    public String getMessage() {
        return message;
    }

    public ChatMessage() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChatMessage(String message) {
        this.message = message;
    }
}
