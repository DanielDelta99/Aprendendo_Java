package classes.idade;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class Controller {

    @FXML
    private TextField anoNasc;

    @FXML
    private Button calcularIdade;

    @FXML
    private Label idadeTela;

    @FXML
    private Label situacaoTela;

    @FXML
    void actionCalcular(ActionEvent event) {
        int ano = Integer.parseInt(anoNasc.getText());
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - ano;
        idadeTela.setText(Integer.toString(idade));

        if (idade < 16) {
            situacaoTela.setText("Proibido");
        } else if (idade >= 16 && idade < 18 || idade >= 70) {
            situacaoTela.setText("Optativo");
        } else {
            situacaoTela.setText("Obrigatorio");
        }

    }
}