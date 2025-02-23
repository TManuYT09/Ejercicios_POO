package org.example.tema6.practica2;

public class DorsalJugadorExcepcion extends RuntimeException {
    public DorsalJugadorExcepcion() {
        super("El numero del dorsal introducido es el mismo que el de otro jugador.");
    }
}
