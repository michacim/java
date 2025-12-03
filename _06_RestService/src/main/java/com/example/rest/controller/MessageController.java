package com.example.rest.controller;

import com.example.rest.model.Message;
import com.example.rest.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
- Definiert URLs und mapped diese auf Methoden
- definiert HTTP-Methoden: get, post, put, delete
 */
@RestController
@RequestMapping("/messages")//http://localhost:8080/messages
public class MessageController {

    @Autowired  //dependency-injection : sucht Implementierung und erzeugt Objekt -> @Service
    private MessageService service;

    @GetMapping  //  default-path: http://localhost:8080/messages
    public List<Message> getAllMessages(){
        return service.getAll();
    }


    @GetMapping("/m")//http://localhost:8080/messages/m?id=2
    public Message getById(@RequestParam(name = "id") int id){
        return service.getById(id);
    }

}
