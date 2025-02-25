package org.example.tema6.practica2;

public class Acompañante extends MutxamelIFC{
    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println(getNombre()+" anima al equipo");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre()+" concentrándose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOOOOL");
    }

}
