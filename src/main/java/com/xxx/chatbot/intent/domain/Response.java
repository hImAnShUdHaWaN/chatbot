
package com.xxx.chatbot.intent.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Response {

    private Boolean resetContexts;

    private String action;

    private List<Object> affectedContexts = new ArrayList<Object>();

    private List<Parameter> parameters = new ArrayList<Parameter>();

    private List<Message> messages = new ArrayList<Message>();

    public Boolean getResetContexts() {
        return resetContexts;
    }

    public void setResetContexts(Boolean resetContexts) {
        this.resetContexts = resetContexts;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Object> getAffectedContexts() {
        return affectedContexts;
    }

    public void setAffectedContexts(List<Object> affectedContexts) {
        this.affectedContexts = affectedContexts;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
