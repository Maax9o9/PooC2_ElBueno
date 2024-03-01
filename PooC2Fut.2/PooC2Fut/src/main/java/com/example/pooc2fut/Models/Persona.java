
package com.example.pooc2fut.Models;

public class Persona {
    private String nombre;
    private String fechaNac;
    private String nacionalidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Persona() {
        this.nombre = "";
        this.fechaNac = "";
        this.nacionalidad = "";
    }

    public Persona(String nombre, String fechaNac, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.nacionalidad = nacionalidad;
    }

    
    public String toString(){
        String texto = "Nombre: " + nombre +
                        "\nFecha de nacimiento: " + fechaNac +
                        "\nNacionalidad: " + nacionalidad;
        
        return texto;
    }
}
