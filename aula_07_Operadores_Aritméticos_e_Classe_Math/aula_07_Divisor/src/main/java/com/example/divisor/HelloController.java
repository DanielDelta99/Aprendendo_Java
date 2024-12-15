package com.example.divisor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField numerador;

    @FXML
    private TextField denominador;

    @FXML
    private Button dividir;

    @FXML
    private Label divisao;

    @FXML
    private Label resto;

    @FXML
    private Button raiz;

    @FXML
    private Label raizTela;

    @FXML
    private Button aleatorio;

    @FXML
    private Label aleatorioTela;

    @FXML
    void actionDividir(ActionEvent event) {
        int numer = Integer.parseInt(numerador.getText());
        int denom = Integer.parseInt(denominador.getText());

        int totalDivisao = numer / denom;
        int totalResto = numer % denom;

        divisao.setText(Integer.toString(totalDivisao));
        resto.setText(Integer.toString(totalResto));
    }

    @FXML
    void actionRaiz(ActionEvent event) {
        int numer = Integer.parseInt(numerador.getText());

        float total = (float) Math.sqrt(numer);

        raizTela.setText(Float.toString(total));
    }

    @FXML
    void actionAleatorio(ActionEvent event) {
        int ale = (int) (Math.random() * 100);
        aleatorioTela.setText(Integer.toString(ale));
    }

}