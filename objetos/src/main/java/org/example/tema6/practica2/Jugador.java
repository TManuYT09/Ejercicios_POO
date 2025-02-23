package org.example.tema6.practica2;

public class Jugador extends MutxamelIFC implements AccionesDeportivas{
    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(Equipos categoria, int dorsal, Posiciones posiciones) {
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posiciones = posiciones;
    }

    public void calentar(){

    }

    public void descansar(){

    }

    public void marcarGol(){

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

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }
}
