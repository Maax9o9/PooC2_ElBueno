package com.example.pooc2fut.controller;


import com.example.pooc2fut.Models.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Optional;


public class AdminController  {
    @FXML
    private TextField estadoJugador;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField txtNombreE;
    @FXML
    private DatePicker fechaE;
    @FXML
    private TextField txtNacionalidaE;
    @FXML
    private TextField txtAeE;

    @FXML
    private TextField txtNombreM;
    @FXML
    private DatePicker fechaM;
    @FXML
    private TextField txtNacionalidaM;
    @FXML
    private TextField txtEspecialidadM;

    @FXML
    private TextField txtNombreF;
    @FXML
    private DatePicker fechaF;
    @FXML
    private TextField txtNacionalidadF;
    @FXML
    private TextField txtPosicionF;
    @FXML
    private Club club = new Club();


    @FXML
    public void guardar() {
        System.out.println("Guardado");

        Futbolista newFutbolista = new Futbolista();
        newFutbolista.setNombre(txtNombreF.getText());
        newFutbolista.setFechaNac(fechaF.getValue().toString());
        newFutbolista.setNacionalidad(txtNacionalidadF.getText());
        newFutbolista.setPosicion(txtPosicionF.getText());
        newFutbolista.setEstado(estadoJugador.getText());
        club.addPersonal(newFutbolista);



        mostrarLista();
    }
    @FXML
    public void guardar2(){
        System.out.println("Guardado");
        Masajista newMasajista = new Masajista();
        newMasajista.setNombre(txtNombreM.getText());
        newMasajista.setFechaNac(fechaM.getValue().toString());
        newMasajista.setNacionalidad(txtNacionalidaM.getText());
        newMasajista.setEspecialidad(txtEspecialidadM.getText());
        club.addPersonal(newMasajista);
        System.out.println(newMasajista);
        mostrarLista();
    }

    @FXML
    public void guardar3(){
        System.out.println("Guardado");
        Entrenador newEntrenador = new Entrenador();
        newEntrenador.setNombre(txtNombreE.getText());
        newEntrenador.setFechaNac(fechaE.getValue().toString());
        newEntrenador.setNacionalidad(txtNacionalidaE.getText());
        newEntrenador.setAñosEntrenando(Integer.parseInt(txtAeE.getText()));
        club.addPersonal(newEntrenador);
        mostrarLista();
    }
    public void mostrarLista(){
        textArea.setText(imprimirLista());
    }
    public String imprimirLista() {
        String personas = "";
            for (Persona persona : club.getLstClub()) {
            personas += persona.toString() + "\n";
        }
        return personas;
    }
    
    public void eliminar(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Eliminar");
        dialog.setHeaderText("Ingrese nombre del personal a eliminar");
        Optional<String> result = dialog.showAndWait();
        var ref = new Object() {
            String res;
        };
        result.ifPresent(respuesta1 -> ref.res = respuesta1 );
        int i = 0;
        int eliminar = -1;
        for (Persona per: club.getLstClub()){
            if (per.getNombre().equals(ref.res)){
                eliminar = i;
            }
            i++;
        }
        if (eliminar != -1){
            club.remove(eliminar);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Eliminar");
            alert.setHeaderText("Personal Eliminado");
            alert.showAndWait();
            mostrarLista();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("No se ha seleccionado a alguien del personal");
            alert.showAndWait();

        }


    }
}
