package com.example.pooc2fut;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.IOException;

public class JaguaresController {

    public void mostrarVista(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Escena2.fxml"));
        Pane root = fxmlLoader.load();


        Scene scene = new Scene(root,896, 661);
        stage.setTitle("Jaguares");
        stage.setScene(scene);
        stage.show();

    }
}