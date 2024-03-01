
package com.example.pooc2fut.Models;

public class Masajista extends Persona{
    private String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Masajista() {
    }

    public Masajista(String especialidad, String nombre, String fechaNac, String nacionalidad) {
        super(nombre, fechaNac, nacionalidad);
        this.especialidad = especialidad;
    }
    
    @Override
    public String toString(){
        String texto = "MASAJISTA\n" + super.toString() + "\n" +
                        "Especialidad: " + especialidad + "\n" +
                        "--------------------------";
        
        return texto;
    } 
}
