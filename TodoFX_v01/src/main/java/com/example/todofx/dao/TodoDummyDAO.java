package com.example.todofx.dao;

import com.example.todofx.model.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoDummyDAO implements TodoDAO{

    private static List<Todo> todos = new ArrayList<>();
    private static int count =1;

    public TodoDummyDAO(){
        todos.add(new Todo(count++,"sport"));
        todos.add(new Todo(count++,"lesen"));
        todos.add(new Todo(count++,"lernen"));
    }

    @Override
    public void save(Todo todo) {
        //FIXME id generieren

        todo.setId(count++);
        todos.add(todo);
        System.out.println(todo);
    }

    @Override
    public List<Todo> findAll() {
        return todos;
    }

    @Override
    public void deleteById(int id) {
       /* for (int i = 0; i < todos.size(); i++) {
            Todo t = todos.get(i);
            if(t.getId() == id ){
                todos.remove(t);
            }
        }
        */
        todos.removeIf(t -> t.getId() == id);//Lambda-Ausdruck ->

    }
}
