package org.example.tema6.herencia_festival;

public class Persona {

    private static final int EDAD_MINIMA=18;

    String nombre;
    int edad;

    public Persona(String nombre, int edad) throws EdadMinimaException {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento(){
        System.out.println("Accediendo al evento...");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadMinimaException {
        this.edad=edad;
        if (edad<EDAD_MINIMA){
            throw new EdadMinimaException("No puede crear a una persona menor de edad.");
        }

    }
}
