package org.example.practica1;

import java.util.Arrays;

public class Empleado {
    private static int numId=0;
    final static String IDEP = "EP";
    final static String[] CARGOS = {"director","tecnico","presentador","colaborador"};

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo){
        id=IDEP+asignarId();
        this.nombre=nombre;
        this.cargo=asignarCargo(cargo);
        asignarDirector(cargo);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String asignarId(){
        numId++;
        return String.format("%03d",numId);
    }

    public String asignarCargo(String cargo){
        for (int i = 0; i < CARGOS.length; i++) {
            if (CARGOS[i].equals(cargo)){
                return cargo;
            }
        }
        return "pte";
    }

    public void asignarDirector(String cargo){
        if (cargo.equals("director")){
            director=null;
        }
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
