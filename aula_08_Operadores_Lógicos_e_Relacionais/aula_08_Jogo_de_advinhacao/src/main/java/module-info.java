module classes.leitordepensamentos {
    requires javafx.controls;
    requires javafx.fxml;


    opens classes.leitordepensamentos to javafx.fxml;
    exports classes.leitordepensamentos;
}