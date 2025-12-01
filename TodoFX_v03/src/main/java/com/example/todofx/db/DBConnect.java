package com.example.todofx.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            createTable();

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

    private void createTable(){
        try {
            Statement st=  con.createStatement();
            st.executeUpdate("""
                    CREATE TABLE IF NOT EXISTS todo(
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        task TEXT NOT NULL,
                        deadline TEXT NOT NULL,
                        state TEXT NOT NULL
                    
                    )
                    """);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
