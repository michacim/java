package com.example.todofx.dao;

import com.example.todofx.db.DBConnect;
import com.example.todofx.model.State;
import com.example.todofx.model.Todo;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoDbDAO implements TodoDAO{



    @Override
    public void save(Todo todo) {
        try {
            Connection con =  DBConnect.getInstance().connect();
            PreparedStatement st = con.prepareStatement(" INSERT INTO todo(task, deadline,state) VALUES(?,?,?) ");
            st.setString(1,todo.getTask());
            st.setString(2,todo.getDeadline().toString());
            st.setString(3,todo.getState().name());
            st.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Todo> findAll() {
        List<Todo> todos = new ArrayList<>();
        try {
            Connection con =  DBConnect.getInstance().connect();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM todo");
            ResultSet rs=  ps.executeQuery();

            while(rs.next()){
                Todo todo = new Todo();
                todo.setId(rs.getInt("id"));
                todo.setTask(rs.getString("task"));
                todo.setDeadline(LocalDate.parse(rs.getString("deadline")));
                todo.setState(State.valueOf(rs.getString("state")));
                todos.add(todo);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return todos;
    }

    @Override
    public void deleteById(int id) {

    }
}
