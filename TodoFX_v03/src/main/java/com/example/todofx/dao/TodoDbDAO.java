package com.example.todofx.dao;

import com.example.todofx.model.Todo;

import java.util.List;

public class TodoDbDAO implements TodoDAO{
    @Override
    public void save(Todo todo) {

    }

    @Override
    public List<Todo> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(int id) {

    }
}
