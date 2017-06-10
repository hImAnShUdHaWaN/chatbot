package com.xxx.chatbot.intent;

public class IntentNotFoundException extends RuntimeException {

    public IntentNotFoundException(String id) {
        super(String.format("No intent entry found with id: <%s>", id));
    }
}
