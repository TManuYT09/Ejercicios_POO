package org.example;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Persona_Temp> componentes;

    public Equipo(String nombre){
        this.nombre=nombre;
        componentes=new ArrayList<>();
    }

    public void anyadirComponente(Persona_Temp persona){
        componentes.add(persona);
    }

    public void eliminarComponente(Persona_Temp persona){
        componentes.remove(persona);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Persona_Temp> getComponentes() {
        return componentes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComponentes(ArrayList<Persona_Temp> componentes) {
        this.componentes = componentes;
    }

    @Override
    public String toString(){
        return "Equipo : [ nombre="+getNombre()+" componentes="+getComponentes()+" ]";
    }
}
