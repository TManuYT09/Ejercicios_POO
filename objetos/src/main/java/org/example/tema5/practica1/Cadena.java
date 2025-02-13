package org.example.tema5.practica1;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaPrograma;

    public Cadena(String nombre){
        this.nombre=nombre;
        listaPrograma=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Programa> getListaPrograma() {
        return listaPrograma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaPrograma=" + listaPrograma +
                '}';
    }
}
