package classes.tipodetriangulo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.TextFlow;

public class Controller {
    @FXML
    private Slider barraA;

    @FXML
    private Slider barraB;

    @FXML
    private Slider barraC;

    @FXML
    private Button calcular;

    @FXML
    private Label telaA;

    @FXML
    private Label telaB;

    @FXML
    private Label telaC;

    @FXML
    private Label tipo;

    @FXML
    private Label verificador;

    @FXML
    private TextFlow caixaTexto;

    @FXML
    public void initialize(){
        barraA.valueProperty().addListener((obs, oldVal, newVal) -> {
            int a = newVal.intValue();
            telaA.setText(Integer.toString(a));
        });

        barraB.valueProperty().addListener((obs, oldval, newVal) -> {
            int b = newVal.intValue();
            telaB.setText(Integer.toString(b));
        });

        barraC.valueProperty().addListener((obs, oldVal, newVal) ->{
            int c = newVal.intValue();
            telaC.setText(Integer.toString(c));
        });
    }

    @FXML
    void actionCalcular(ActionEvent event) {
        int a, b, c;
        a = barraA.valueProperty().intValue();
        b = barraB.valueProperty().intValue();
        c = barraC.valueProperty().intValue();

        caixaTexto.setVisible(true);

        if (a + b > c && b + c > a && a + c > b) {
            verificador.setText("Formar um triangulo");
            if (a == b && b == c) {
                tipo.setText("Equilátero");
            } else if (a == b || a == c || b == c){
                tipo.setText("Isósceles");
            } else {
                tipo.setText("Escaleno");
            }
        } else {
            verificador.setText("Não forma um triângulo");
            tipo.setText("");
        }
    }

}