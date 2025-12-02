package com.example.todofx.dao;

import com.example.todofx.db.DBConnect;
import com.example.todofx.model.State;
import com.example.todofx.model.Todo;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoDbDAO implements TodoDAO{
    private Connection con;

    public TodoDbDAO(){
         con =  DBConnect.getInstance().connect();
    }


    @Override
    public void save(Todo todo) {
        try {

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

            PreparedStatement ps = con.prepareStatement("SELECT * FROM todo");
            ResultSet rs=  ps.executeQuery();
            createList(rs, todos);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return todos;
    }

    private static void createList(ResultSet rs, List<Todo> todos) throws SQLException {
        while(rs.next()){
            Todo todo = new Todo();
            todo.setId(rs.getInt("id"));
            todo.setTask(rs.getString("task"));
            todo.setDeadline(LocalDate.parse(rs.getString("deadline")));
            todo.setState(State.valueOf(rs.getString("state")));
            todos.add(todo);
        }
    }

    @Override
    public void deleteById(int id) {
        try {

            PreparedStatement st = con.prepareStatement("DELETE FROM todo WHERE id = ?");
            st.setInt(1,id);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
