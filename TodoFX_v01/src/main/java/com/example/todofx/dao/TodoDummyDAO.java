package com.example.todofx.dao;

import com.example.todofx.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoDummyDAO implements TodoDAO{

    List<Todo> todos = new ArrayList<>();

    public TodoDummyDAO(){
        todos.add(new Todo(1,"sport"));
        todos.add(new Todo(2,"lesen"));
        todos.add(new Todo(3,"lernen"));
    }

    @Override
    public void save(Todo todo) {
        //FIXME id generieren
        todos.add(todo);
    }

    @Override
    public List<Todo> findAll() {
        return todos;
    }
}
