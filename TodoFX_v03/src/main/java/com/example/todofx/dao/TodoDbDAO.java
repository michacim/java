package com.example.todofx.dao;

import com.example.todofx.db.DBConnect;
import com.example.todofx.model.Todo;

import java.sql.*;
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
        ArrayList<Todo> list = new ArrayList<>();
        //
        try {
            Connection con =  DBConnect.getInstance().connect();
            PreparedStatement ps = con.prepareStatement("hier sql");
           ResultSet rs = ps.executeQuery();
           // in while-Schleife Todos erzeugen und an ArrayListe bringen
            while (rs.next()){
                Todo t = new Todo();
                t.setId(rs.getInt("id"));
                //alle werte setzen
                //
                list.add(t);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return list;
    }

    @Override
    public void deleteById(int id) {

    }
}
