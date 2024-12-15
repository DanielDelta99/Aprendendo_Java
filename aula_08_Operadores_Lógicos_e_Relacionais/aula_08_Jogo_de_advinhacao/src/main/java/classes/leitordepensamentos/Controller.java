package classes.leitordepensamentos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    private Label inicioTela;

    @FXML
    private Label finalTela;

    @FXML
    private TextField numero;

    @FXML
    private Button palpite;

    @FXML
    void comparar(ActionEvent event) {
        int genio = (int) (1 + Math.random() * (6 - 1));
        int palpite = Integer.parseInt(numero.getText());
        String texto = palpite == genio ? "ACERTOU":"ERROU! Pensei em " + Integer.toString(genio);

        inicioTela.setText("");
        finalTela.setText(texto);
    }

}
