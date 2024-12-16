module classes.parouimpar {
    requires javafx.controls;
    requires javafx.fxml;


    opens classes.parouimpar to javafx.fxml;
    exports classes.parouimpar;
}