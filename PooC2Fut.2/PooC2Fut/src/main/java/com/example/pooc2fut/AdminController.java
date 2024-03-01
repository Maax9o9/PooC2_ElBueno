package com.example.pooc2fut;


import com.example.pooc2fut.Models.Entrenador;
import com.example.pooc2fut.Models.Futbolista;
import com.example.pooc2fut.Models.Masajista;
import com.example.pooc2fut.Models.Persona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.Optional;
import java.util.Stack;

public class AdminController {
    @FXML
    private TextField estadoJugador;

    @FXML
    private TextArea textArea;
    @FXML
    private Button guardar2;
    @FXML
    private Button guardar3;

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

    private Stack<Persona> lstFutbolista = new Stack<>();


    @FXML
    public void guardar(){
        System.out.println("Guardado");
        Futbolista newFutbolista = new Futbolista();
        newFutbolista.setNombre(txtNombreF.getText());
        newFutbolista.setFechaNac(fechaF.getValue().toString());
        newFutbolista.setNacionalidad(txtNacionalidadF.getText());
        newFutbolista.setPosicion(txtPosicionF.getText());
        newFutbolista.setEstado(estadoJugador.getText());

        lstFutbolista.add(newFutbolista);
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
        lstFutbolista.add(newMasajista);
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
        lstFutbolista.add(newEntrenador);
        mostrarLista();
    }

    public void mostrarLista(){
        textArea.setText(imprimirLista());
    }
    public String imprimirLista(){
        String personas = "";
        for (Persona persona: lstFutbolista){
            personas = personas + persona.toString() + "\n";
            System.out.println(persona.toString() + "\n");
        }
        return personas;
    }
    public void eliminar(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Eliminar");
        dialog.setHeaderText("Ingrese nombre del personal a eliminar");
        Optional<String> result = dialog.showAndWait();
        var ref = new Object() {
            String respuesta;
        };
        result.ifPresent(respuesta1 -> ref.respuesta = respuesta1 );
        int aux = 0;
        int eliminar = -1;
        for (Persona iterador: lstFutbolista){
            if (iterador.getNombre().equals(ref.respuesta)){
                eliminar = aux;
            }
            aux++;
        }
        if (eliminar != -1){
            lstFutbolista.remove(eliminar);
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
