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
        System.out.println(getNombre()+ "esta descansando");
    }

    public void marcarGol(){
        System.out.println("El jugador "+dorsal+", "+getNombre()+", ha marcado un gol");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre()+"se esta concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre()+" a viajando a "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(getNombre()+" esta celebrando un gol");
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre()+" esta celebrando un gol");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(getNombre()+" juega un partido contra "+rival);
    }
}
