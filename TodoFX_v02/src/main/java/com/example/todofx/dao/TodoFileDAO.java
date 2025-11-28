package com.example.todofx.dao;

import com.example.todofx.file.FileHandler;
import com.example.todofx.model.Todo;

import java.util.List;

public class TodoFileDAO implements TodoDAO{

    @Override
    public void save(Todo todo) {
        todo.setId(calculateNextId());
        FileHandler.writeText(todo);
    }

    @Override
    public List<Todo> findAll() {
        //TODO aus Datei lesen todo.txt - Liste mit Todos erzeugen
        // und zurückgeben

        return FileHandler.readText();
    }

    @Override
    public void deleteById(int id) {
        //FIXME Aufgabe-> 

    }
    private int calculateNextId() {
        List<Todo> todos = findAll();
        return todos.stream()
                .mapToInt(Todo::getId)
                .max()
                .orElse(0) + 1;
    }


}
