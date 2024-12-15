module classes.supercalculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens classes.supercalculadora to javafx.fxml;
    exports classes.supercalculadora;
}