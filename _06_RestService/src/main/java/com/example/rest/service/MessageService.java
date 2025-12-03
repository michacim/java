package com.example.rest.service;

import com.example.rest.model.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAll();
    Message save(Message msg);
    Message getById(int id);

    // Aufgabe

    /**
     *
     * @param text- Teilstring einer Message
     * z.B. ha   findet alle Messages die hallo enthalten hallo Max
     * @return Liste mit Message-Objekten
     */
    List<Message> getByMessageText(String text);

    /**
     *
     * @return die letzte Nachricht in der Liste
     */
    Message getLastMessage();

    /**
    gibt die Liste in umgekehrter Reihenfolge zurück
     */
    List<Message> getReverseList();


    /**
     * eine zufällige Nachricht zurückgeben
     */
    Message getRandomMessage();
}
