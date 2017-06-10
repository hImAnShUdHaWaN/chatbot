
package com.xxx.chatbot.intent.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameter {

    private Boolean required;

    private String dataType;

    private String name;

    private String value;

    private List<String> prompts = new ArrayList<String>();

    private Boolean isList;

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getPrompts() {
        return prompts;
    }

    public void setPrompts(List<String> prompts) {
        this.prompts = prompts;
    }

    public Boolean getIsList() {
        return isList;
    }

    public void setIsList(Boolean isList) {
        this.isList = isList;
    }

}
