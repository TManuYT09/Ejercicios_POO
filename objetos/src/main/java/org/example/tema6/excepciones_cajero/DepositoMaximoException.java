package org.example.tema6.excepciones_cajero;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("No se puede depositar más de 3000 euros");
    }
}
