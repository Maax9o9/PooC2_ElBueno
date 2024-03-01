package com.example.pooc2fut.Models;

import java.util.Stack;

public class Club {
    private Persona persona;
    private Stack<Persona> lstClub = new Stack<>();

    public Stack<Persona> getLstClub() {
        return lstClub;
    }

    public void addPersonal(Persona persona){
        lstClub.add(persona);
    }

    public String personas(){
        String personas = "";
        for (Persona persona : lstClub){
            personas = personas + persona.toString() + "\n";
        }
        return personas;
    }

    public void remove(int eliminar) {
        lstClub.remove(eliminar);
    }
}
