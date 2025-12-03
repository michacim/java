package com.example.rest.service;

import com.example.rest.model.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAll();
    Message save(Message msg);
    Message getById(int id);
}
