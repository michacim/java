package com.example.todofx.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
DBConnect als Singleton
 */
public class DBConnect {


    private static final String DB_URL ="jdbc:sqlite:todo.db";
    private static DBConnect instance = null;
    private Connection con;

    private DBConnect(){

        try {
            con = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static DBConnect getInstance(){
        if(instance==null){
            instance = new DBConnect();
        }

        return  instance;
    }

    public Connection connect(){
        return  con;
    }
}
