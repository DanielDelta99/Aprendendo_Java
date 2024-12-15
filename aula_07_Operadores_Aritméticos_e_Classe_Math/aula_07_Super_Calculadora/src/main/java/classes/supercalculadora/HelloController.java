package classes.supercalculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Button calcular;

    @FXML
    private TextField entradaDados;

    @FXML
    private Label resultado01;

    @FXML
    private Label resultado02;

    @FXML
    private Label resultado03;

    @FXML
    private Label resultado04;

    @FXML
    private Label resultado05;

    @FXML
    private Label tela01;

    @FXML
    private Label tela02;

    @FXML
    private Label tela03;

    @FXML
    private Label tela04;

    @FXML
    private Label tela05;

    @FXML
    void actionCalcular(ActionEvent event) {
        tela01.setText("Resto da divisão por 2");
        tela02.setText("Elevado ao cubo");
        tela03.setText("Raiz quadrada");
        tela04.setText("Raiz cúbica");
        tela05.setText("Valor absoluto");

        int numero = Integer.parseInt(entradaDados.getText());
        int divisao = numero % 2;
        double elevado = Math.pow(numero,3);
        double raiz = Math.sqrt(numero);
        double cubica = Math.cbrt(numero);
        int absolute = Math.abs(numero);

        resultado01.setText(Integer.toString(divisao));
        resultado02.setText(String.format("%.2f", elevado));
        resultado03.setText(String.format("%.2f", raiz));
        resultado04.setText(String.format("%.2f", cubica));
        resultado05.setText(Integer.toString(absolute));


    }

}
