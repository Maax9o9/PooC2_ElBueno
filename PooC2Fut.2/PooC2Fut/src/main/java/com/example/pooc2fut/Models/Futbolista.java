
package com.example.pooc2fut.Models;


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
    }

    public Futbolista( String nombre, String fechaNac, String nacionalidad,String posicion) {
        super(nombre, fechaNac, nacionalidad);
        this.posicion = posicion;
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
