package com.example.todofx.dao;

import com.example.todofx.model.Todo;

import java.util.List;

public interface TodoDAO {
    void save(Todo todo);

    List<Todo> findAll();

    void  deleteById(int id);

}
