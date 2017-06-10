package com.xxx.chatbot.intent.services;

import com.xxx.chatbot.intent.IntentNotFoundException;
import com.xxx.chatbot.intent.dao.IntentRepository;
import com.xxx.chatbot.intent.domain.Intent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoDBIntentService implements IntentService {

    private final IntentRepository repository;

    @Autowired
    public MongoDBIntentService(IntentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Intent create(Intent intent) {
        return repository.save(intent);
    }

    @Override
    public Intent delete(String id) {
        Intent deleted = findIntentById(id);
        repository.delete(deleted);
        return deleted;
    }

    @Override
    public List<Intent> findAll() {
        return repository.findAll();
    }

    @Override
    public Intent findById(String id) {
        return findIntentById(id);

    }

    private Intent findIntentById(String id) {
        Optional<Intent> result = repository.findOne(id);
        return result.orElseThrow(() -> new IntentNotFoundException(id));
    }
}
