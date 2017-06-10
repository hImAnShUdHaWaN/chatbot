
package com.xxx.chatbot.intent.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Datum {

    private String text;

    private String alias;

    private String meta;

    private Boolean userDefined;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public Boolean getUserDefined() {
        return userDefined;
    }

    public void setUserDefined(Boolean userDefined) {
        this.userDefined = userDefined;
    }
}
