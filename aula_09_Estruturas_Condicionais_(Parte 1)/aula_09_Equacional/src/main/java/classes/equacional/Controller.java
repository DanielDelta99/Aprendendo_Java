package classes.equacional;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;

public class Controller {
    @FXML
    private TextFlow caixaResultado;

    @FXML
    private Label resultado;

    @FXML
    private Label tipo;

    @FXML
    private Button calcular;

    @FXML
    private TextField entradaA;

    @FXML
    private TextField entradaB;

    @FXML
    private TextField entradaC;

    @FXML
    private Label textoA;

    @FXML
    private Label textoB;

    @FXML
    private Label textoC;


    @FXML
    public void initialize() {
        entradaA.textProperty().addListener((observable, oldValue, newValue) -> {
            textoA.setText(entradaA.getText());
        });

        entradaB.textProperty().addListener((observable, oldValue, newValue) -> {
            textoB.setText(entradaB.getText());
        });

        entradaC.textProperty().addListener((observable, oldValue, newValue) -> {
            textoC.setText(entradaC.getText());
        });

    }


    @FXML
    void actionCalcular(ActionEvent event) {
        int a, b, c;
        a = Integer.parseInt(entradaA.getText());
        b = Integer.parseInt(entradaB.getText());
        c = Integer.parseInt(entradaC.getText());

        var total = (b*b) - ((4*a)*c);

        if (total > 0){
            tipo.setText("Existem raizes reais!");
        } else {
            tipo.setText("Não existem raizes reais!");
        };

        caixaResultado.setVisible(true);
        resultado.setText(Integer.toString(total));


    }
}