package com.example.hellofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private Label label;//fx-id

    @FXML
    private TextField textfield;//fx-id

    @FXML
    void onClick(ActionEvent event) {
        label.setText(textfield.getText());
    }

    @FXML
    void initialize(){
        //wird nach den Konstruktor aufgerufen
        System.out.println("init...");



    }

}
