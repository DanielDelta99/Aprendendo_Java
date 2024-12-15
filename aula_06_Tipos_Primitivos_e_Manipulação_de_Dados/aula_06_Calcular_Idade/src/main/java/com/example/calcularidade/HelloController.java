package com.example.calcularidade;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class HelloController {
    static int anoNasc = 0;
    static int anoAtual = 0;


    @FXML
    private Label anoAtualText;

    @FXML
    private DatePicker dataNascimento;

    @FXML
    private Label idade;

    @FXML
    void extrairAno() {
        LocalDate data = dataNascimento.getValue();

        if (data != null){
            anoNasc = data.getYear();
        } else {
            System.out.println("nenhuma data foi selecionada.");
        }
    }

    @FXML
    private void initialize(){
        LocalDate dataAtual = LocalDate.now();
        anoAtual = dataAtual.getYear();
        anoAtualText.setText(Integer.toString(anoAtual));
    }
    
    @FXML
    private void calcular(){
        extrairAno();

        int idadeCalculada = anoAtual - anoNasc;
        idade.setText(idadeCalculada + " Anos");

    }
}