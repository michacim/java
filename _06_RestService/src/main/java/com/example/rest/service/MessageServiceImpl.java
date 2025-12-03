package com.example.rest.service;

import com.example.rest.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service   // für @Autowired
public class MessageServiceImpl implements MessageService{

    List<Message> messages = new ArrayList<>();

    public MessageServiceImpl(){
        messages.add(new Message(1,"guten Tag"));
        messages.add(new Message(2,"hallo, wie geht's?"));
        messages.add(new Message(3,"guten Morgen"));
        messages.add(new Message(4,"hallo Max"));
        messages.add(new Message(5,"guten Abend"));
        messages.add(new Message(6,"hallo Welt"));
    }


    @Override
    public List<Message> getAll() {
        return messages;
    }

    @Override
    public Message save(Message msg) {
        messages.add(msg);
        return msg;
    }

    @Override
    public Message getById(int id) {
        for(Message m: messages){
            if(m.getId()==id){
                return m;
            }
        }
        return null;
    }


    //Aufgabe
    @Override
    public List<Message> getByMessageText(String text) {
        return List.of();
    }

    @Override
    public Message getLastMessage() {
        return null;
    }

    @Override
    public List<Message> getReverseList() {
        return List.of();
    }

    @Override
    public Message getRandomMessage() {
        return null;
    }
}
