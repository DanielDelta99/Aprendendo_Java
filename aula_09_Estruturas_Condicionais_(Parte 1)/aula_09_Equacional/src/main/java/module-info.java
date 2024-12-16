module classes.equacional {
    requires javafx.controls;
    requires javafx.fxml;


    opens classes.equacional to javafx.fxml;
    exports classes.equacional;
}