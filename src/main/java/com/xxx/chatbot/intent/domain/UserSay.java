
package com.xxx.chatbot.intent.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserSay {

    private String id;

    private List<Datum> data = new ArrayList<Datum>();

    private Boolean isTemplate;

    private Integer count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
