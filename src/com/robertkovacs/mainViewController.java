package com.robertkovacs;


import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class mainViewController {

    @FXML
    TextField inputField;
    @FXML
    TextField outputField;

    @FXML
    public void codeButtonClickHandle() {
        outputField.setText(HammingCodeGenerator.generate(inputField.getText()));
    }
}
