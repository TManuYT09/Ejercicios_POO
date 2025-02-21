package org.example.tema6.excepciones_cajero;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("Has superado el limite diario");
    }
}
