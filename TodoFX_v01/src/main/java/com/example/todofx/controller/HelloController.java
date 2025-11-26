package com.example.todofx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {


    //----------------- Save -----------------------
    @FXML
    private TextField taskField;
    @FXML
    private DatePicker deadlineField;

    // --------------- TableView -------------------
    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> deadlineCol;


    @FXML
    private TableColumn<?, ?> stateCol;


    @FXML
    private TableColumn<?, ?> taskCol;


    @FXML
    void onSave(ActionEvent event) {

    }

}
