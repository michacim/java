package com.example.todofx;

import com.example.todofx.db.DBConnect;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class TodoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setAlwaysOnTop(true);
        FXMLLoader fxmlLoader = new FXMLLoader(TodoApplication.class.getResource("todo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> {
            System.out.println("close");
            try {
                DBConnect.getInstance().connect().close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
