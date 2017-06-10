package com.xxx.chatbot.intent.controller;

import com.xxx.chatbot.intent.IntentNotFoundException;
import com.xxx.chatbot.intent.domain.Intent;
import com.xxx.chatbot.intent.services.IntentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/intent")
public class IntentController {

    private final IntentService service;

    @Autowired
    public IntentController(IntentService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Intent create(@RequestBody @Valid Intent intentEntry) {
        return service.create(intentEntry);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    Intent delete(@PathVariable("id") String id) {
        return service.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Intent> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    Intent findById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleIntentNotFound(IntentNotFoundException ex) {
    }
}
