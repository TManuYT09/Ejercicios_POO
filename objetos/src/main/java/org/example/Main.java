package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona("Pepe", "Sanchéz", "12345678A", 80, 30, "Madrid", "Persiana");
        Persona persona2=new Persona();

        persona1.imprimirInfoPersona();
        persona2.imprimirInfoPersona();
        System.out.println(persona1.concatenar());

        System.out.println("Antes: " + persona1.getNombre());
        persona1.setNombre("Pepa");
        System.out.println("Despues: " + persona1.getNombre());
        persona1.setNombre("messi");
        System.out.println("Madrit: " + persona1.getNombre());
    }
}