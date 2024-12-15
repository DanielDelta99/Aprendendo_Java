module com.example.divisor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.divisor to javafx.fxml;
    exports com.example.divisor;
}