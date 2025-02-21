package org.example.tema6.excepciones;

public class NivelValidoException extends Exception {

  public NivelValidoException() {
    super("El nivel no puede ser mayor a 100");
  }
}
