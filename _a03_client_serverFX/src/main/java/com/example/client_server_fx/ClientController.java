package com.example.client_server_fx;

import com.example.client_server_fx.client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ClientController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField responseField;

    @FXML
    void onSend(ActionEvent event) {

       String response = Client.sendMessage(nameField.getText());
       responseField.setText(response);
    }

}
