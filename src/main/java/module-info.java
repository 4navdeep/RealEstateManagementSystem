module PropertyManagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens View2 to javafx.fxml;
    exports View2;
}