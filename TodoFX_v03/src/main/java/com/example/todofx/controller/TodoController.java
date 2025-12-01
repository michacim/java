package com.example.todofx.controller;

import com.example.todofx.dao.TodoDAO;
import com.example.todofx.dao.TodoDbDAO;
import com.example.todofx.dao.TodoDummyDAO;
import com.example.todofx.dao.TodoFileDAO;
import com.example.todofx.model.State;
import com.example.todofx.model.Todo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class TodoController {

   // private TodoDAO dao = new TodoDummyDAO();
  // private TodoDAO dao = new TodoFileDAO();
   private TodoDAO dao = new TodoDbDAO();

    //----------------- Save -----------------------
    @FXML
    private TextField taskField;
    @FXML
    private DatePicker deadlineField;

    // --------------- TableView -------------------
    @FXML
    private TableView<Todo> tableView;

    @FXML
    private TableColumn<Todo, LocalDate> deadlineCol;


    @FXML
    private TableColumn<Todo, State> stateCol;


    @FXML
    private TableColumn<Todo, String> taskCol;


    @FXML
    void onSave(ActionEvent event) {
        //dao.save(new Todo(...));
        Todo todo = new Todo(taskField.getText(), deadlineField.getValue());
        dao.save(todo);
        //refresh? neu laden?
        tableView.getItems().setAll(dao.findAll());
    }

    @FXML
    void initialize(){
        System.out.println("init Controller");
        //tableView.getItems().add( new Todo(1,"einkaufen", LocalDate.now() , State.OPEN)  );
        taskCol.setCellValueFactory(new PropertyValueFactory<>("task"));//getTask()
        deadlineCol.setCellValueFactory(new PropertyValueFactory<>("deadline"));//getTask()
        stateCol.setCellValueFactory(new PropertyValueFactory<>("state"));//getTask()
        tableView.getItems().setAll(dao.findAll());//RefreshTable

    //-------------- ContextMenu --------------------
        ContextMenu cm = new ContextMenu();
        MenuItem deleteItem = new MenuItem("Delete");
        cm.getItems().add(deleteItem);

        deleteItem.setOnAction(e -> {
            System.out.println("delete...");
            Todo delTodo = tableView.getSelectionModel().getSelectedItem();
            dao.deleteById(delTodo.getId());
            tableView.getItems().setAll(dao.findAll());//refresh
        });

        tableView.setContextMenu(cm);




    }

}
