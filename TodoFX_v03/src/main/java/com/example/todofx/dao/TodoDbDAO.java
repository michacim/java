package com.example.todofx.dao;

import com.example.todofx.db.DBConnect;
import com.example.todofx.model.Todo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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

        return List.of();
    }

    @Override
    public void deleteById(int id) {

    }
}
