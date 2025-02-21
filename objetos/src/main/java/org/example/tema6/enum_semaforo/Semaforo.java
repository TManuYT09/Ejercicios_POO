package org.example.tema6.enum_semaforo;

public enum Semaforo {
    AMARILLO,
    ROJO,
    VERDE;

    public Semaforo siguiente(Semaforo actual){
        switch (actual){
            case ROJO: return Semaforo.VERDE;
            case VERDE:return Semaforo.AMARILLO;
            case AMARILLO:return Semaforo.ROJO;
            default:return Semaforo.ROJO;
        }
    }
}
