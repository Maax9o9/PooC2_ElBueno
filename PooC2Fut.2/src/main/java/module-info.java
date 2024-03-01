module com.example.pooc2fut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pooc2fut to javafx.fxml;
    exports com.example.pooc2fut;
    exports com.example.pooc2fut.controller;
    opens com.example.pooc2fut.controller to javafx.fxml;
}