package org.example.tema6.practica2;

public class FormacionFormatoException extends RuntimeException {
    public FormacionFormatoException() {
        super("La formación introducida no es la misma que la formación favorita del entrenador.");
    }
}
