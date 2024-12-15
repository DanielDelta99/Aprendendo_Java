module com.example.terceirofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.somador to javafx.fxml;
    exports com.example.somador;
}