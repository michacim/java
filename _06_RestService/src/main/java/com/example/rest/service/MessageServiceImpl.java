package com.example.rest.service;

import com.example.rest.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MessageServiceImpl implements MessageService{

    List<Message> messages = new ArrayList<>();

    public MessageServiceImpl(){
        messages.add(new Message(1,"guten Tag"));
        messages.add(new Message(2,"hallo, wie geht's?"));
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
}
