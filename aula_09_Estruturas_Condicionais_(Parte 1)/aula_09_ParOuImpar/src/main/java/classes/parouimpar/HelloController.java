package classes.parouimpar;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField numero;

    @FXML
    private Label text;

    @FXML
    private Button verificar;

    @FXML
    void actionVerificar(ActionEvent event) {
        int numer = Integer.parseInt(numero.getText());

        if (numer % 2 == 0) {
            text.setText("Par");
        } else {
            text.setText("Ímpar");
        }
    }

}