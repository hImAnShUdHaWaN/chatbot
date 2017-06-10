
package com.xxx.chatbot.intent.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Intent {

    private List<String> templates = new ArrayList<String>();

    private List<UserSay> userSays = new ArrayList<UserSay>();

    private String id;

    private String name;

    private Boolean auto;

    private List<Object> contexts = new ArrayList<Object>();

    private List<Response> responses = new ArrayList<Response>();

    private Integer priority;

    private Boolean fallbackIntent;

    private List<Object> events = new ArrayList<Object>();

    public List<String> getTemplates() {
        return templates;
    }

    public void setTemplates(List<String> templates) {
        this.templates = templates;
    }

    public List<UserSay> getUserSays() {
        return userSays;
    }

    public void setUserSays(List<UserSay> userSays) {
        this.userSays = userSays;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAuto() {
        return auto;
    }

    public void setAuto(Boolean auto) {
        this.auto = auto;
    }

    public List<Object> getContexts() {
        return contexts;
    }

    public void setContexts(List<Object> contexts) {
        this.contexts = contexts;
    }

    public List<Response> getResponses() {
        return responses;
    }

    public void setResponses(List<Response> responses) {
        this.responses = responses;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Boolean getFallbackIntent() {
        return fallbackIntent;
    }

    public void setFallbackIntent(Boolean fallbackIntent) {
        this.fallbackIntent = fallbackIntent;
    }

    public List<Object> getEvents() {
        return events;
    }

    public void setEvents(List<Object> events) {
        this.events = events;
    }
}
