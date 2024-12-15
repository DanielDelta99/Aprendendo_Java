module classes.idade {
    requires javafx.controls;
    requires javafx.fxml;


    opens classes.idade to javafx.fxml;
    exports classes.idade;
}