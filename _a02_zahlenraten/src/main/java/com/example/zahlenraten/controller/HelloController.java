package com.example.zahlenraten.controller;

import com.example.zahlenraten.service.NumberService;
import com.example.zahlenraten.service.NumberServiceImpl;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    private NumberService service = new NumberServiceImpl();
    @FXML
    private TextField callNumberField;

    @FXML
    private TextField listSizeField;

    @FXML
    private Label resultLabel;

    private int[] numbers;
    private int rand;

    @FXML
    void onCall(ActionEvent event) {
        int callNumber = Integer.parseInt(callNumberField.getText());
        if(rand==callNumber){
            resultLabel.setText("Gewonnen");

        } else if (rand>callNumber) {
            resultLabel.setText("zu klein");
        }else{
            resultLabel.setText("zu groß");
        }
        System.out.println(rand);
    }

    @FXML
    void onCreate(ActionEvent event) {
        numbers = service.createNumberList(Integer.parseInt(listSizeField.getText()));
        rand = service.randNumber(numbers);

    }

}
