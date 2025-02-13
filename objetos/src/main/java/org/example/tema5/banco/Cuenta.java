package org.example.tema5.banco;

public class Cuenta {
    private static int numIBAN=0;

    private String iban;
    private Cliente titular;
    private double saldo;

    public Cuenta(){
        iban=asignarID();
        titular=null;
        saldo=0;
    }

    public String asignarID(){
        numIBAN++;
        return String.format("%X3d",numIBAN);
    }
}
