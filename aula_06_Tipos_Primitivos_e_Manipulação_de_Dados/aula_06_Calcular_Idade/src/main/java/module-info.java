module com.example.calcularidade {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.calcularidade to javafx.fxml;
    exports com.example.calcularidade;
}