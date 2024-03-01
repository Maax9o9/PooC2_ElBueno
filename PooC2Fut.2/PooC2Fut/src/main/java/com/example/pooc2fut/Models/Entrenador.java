
package com.example.pooc2fut.Models;

public class Entrenador extends Persona{
    private int añosEntrenando;


    public int getAñosEntrenando() {
        return añosEntrenando;
    }

    public void setAñosEntrenando(int añosEntrenando) {
        this.añosEntrenando = añosEntrenando;
    }



    public Entrenador() {
        super();
        this.añosEntrenando = 0;
    }

    public Entrenador(int añosEntrenando, int nroEquipos, String nombre, String fechaNac, String nacionalidad) {
        super(nombre, fechaNac, nacionalidad);
        this.añosEntrenando = añosEntrenando;
    }
    
    @Override
    public String toString (){
        String texto = "ENTRENADOR\n" + super.toString() + "\n" +
                        "Años de Entrenador: " + añosEntrenando + "\n" +
                        "--------------------------";
        
        return texto;
    } 
    
}
