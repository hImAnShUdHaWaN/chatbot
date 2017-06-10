package com.xxx.chatbot.intent.dao;

import com.xxx.chatbot.intent.domain.Intent;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface IntentRepository extends Repository<Intent, String> {

    void delete(Intent deleted);

    List<Intent> findAll();

    Optional<Intent> findOne(String id);

    Intent save(Intent saved);
}
