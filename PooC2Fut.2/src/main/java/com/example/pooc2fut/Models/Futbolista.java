
package com.example.pooc2fut.Models;


import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Futbolista extends Persona{
    private String posicion;
    private String estado;

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Futbolista() {
        super();
        this.posicion = "";
        this.estado = "";
    }

    public Futbolista( String nombre, String fechaNac, String nacionalidad,String posicion,String estado) {
        super(nombre, fechaNac, nacionalidad);
        this.posicion = posicion;
        this.estado = estado;
    }

    @Override
    public String toString(){
        String texto = "FUTBOLISTA\n" + super.toString() + "\n" +
                        "Posicion: " + posicion + "\n" +
                        "Estado del Jugador: " + estado +"\n" +
                        "--------------------------";
        return texto;
    }


}
