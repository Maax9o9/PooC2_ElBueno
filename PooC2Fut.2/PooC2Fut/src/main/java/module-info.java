module com.example.pooc2fut {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pooc2fut to javafx.fxml;
    exports com.example.pooc2fut;
}