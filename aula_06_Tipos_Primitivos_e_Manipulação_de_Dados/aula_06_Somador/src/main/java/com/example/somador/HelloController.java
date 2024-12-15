package com.example.somador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button igual;

    @FXML
    private TextField numDois;

    @FXML
    private TextField numUm;

    @FXML
    private Label resultado;

    @FXML
    void calcular() {
        int numero1 = Integer.parseInt(numUm.getText());
        int numero2 = Integer.parseInt(numDois.getText());

        resultado.setText(String.valueOf(numero1 + numero2));
    }
    }
