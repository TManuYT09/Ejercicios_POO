package org.example.tema6.practica2;

public class Acompañante extends MutxamelIFC{
    private Jugador integrante;
    private String parentesco;

    public Acompañante(Jugador integrante, String parentesco) {
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }
}
