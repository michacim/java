package com.example.todofx.dao;

import com.example.todofx.model.Todo;

import java.util.List;

public class TodoFileDAO implements TodoDAO{

    @Override
    public void save(Todo todo) {
        //TODO in Datei todo.txt Speichern: 1 , einkaufen, 2022-10-10, OPEN
    }

    @Override
    public List<Todo> findAll() {
        //TODO aus Datei lesen todo.txt - Liste mit Todos erzeugen
        // und zurückgeben
        return List.of();
    }

    @Override
    public void deleteById(int id) {
        //FIXME später

    }
}
