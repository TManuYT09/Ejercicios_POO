package org.example.tema6.practica2;

public class Jugador extends MutxamelIFC implements AccionesDeportivas{
    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posiciones) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posiciones = posiciones;
    }

    public void calentar(){
        System.out.println(getNombre()+" esta calentando");
    }

    public void descansar(){
        System.out.println(getNombre()+ " esta descansando");
    }

    public void marcarGol(){
        System.out.println("El jugador "+dorsal+", "+getNombre()+", ha marcado un gol");
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

    @Override
    public void entrenar() {
        System.out.println(getNombre()+" esta celebrando un gol");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugando un partido contra "+rival);
    }
}
