module classes.tipodetriangulo {
    requires javafx.controls;
    requires javafx.fxml;


    opens classes.tipodetriangulo to javafx.fxml;
    exports classes.tipodetriangulo;
}