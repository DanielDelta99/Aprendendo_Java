module classes.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens classes.javafx to javafx.fxml;
    exports classes.javafx;
}