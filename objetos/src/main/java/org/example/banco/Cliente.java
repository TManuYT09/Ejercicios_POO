package org.example.banco;

import java.util.Scanner;

public class Cliente {
    private static int numId=0;

    private int id;
    private String nombre;
    private String apellidos;

    public Cliente(){
        id=asignarID();
        nombre=asignarNombre();
        apellidos=asignarApellidos();
    }

    public static int asignarID(){
        numId++;
        return numId;
    }

    public String asignarNombre(){
        Scanner entrada=new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        return entrada.next();
    }

    public String asignarApellidos(){
        Scanner entrada=new Scanner(System.in);

        System.out.println("¿Cuales son tus apellidos?");
        return entrada.nextLine();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
