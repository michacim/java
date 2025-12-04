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
- Endpoint
- Presentation- Layer
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
        //public ResponseEntity(Message) getById(...
        Message m= service.getById(id);

        if(m==null){
           return new Message(-1,"not found");
        }
        return m;
    }
    @GetMapping("/text")//http://localhost:8080/messages/text?t=ha
    public List<Message> getByMessageText(@RequestParam(name = "t") String text){
        return service.getByMessageText(text);
    }
    @GetMapping("/last")
    public Message getLastMessage() {
        return service.getLastMessage();
    }
    @GetMapping("/reverse")
    public List<Message> getReverseList() {
        return service.getReverseList();
    }
    @GetMapping("/random")
    public Message getRandomMessage() {
      return  service.getRandomMessage();
    }
}
