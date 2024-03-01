package com.example.pooc2fut.controller;

import com.example.pooc2fut.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


import java.io.IOException;

public class JaguaresController {
    public void mostrarVista(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AdminView.fxml"));
        Pane root1 = fxmlLoader.load();


        Scene scene = new Scene(root1,896, 661);
        stage.setTitle("Jaguares");
        stage.setScene(scene);
        stage.show();

    }
}