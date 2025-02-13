package org.example.tema6.pokemon;

public class Agua extends Pokemon{

    public Agua(int nivel, int ps) {
        super(nivel,ps);
    }

    @Override
    public void atacar() {
        System.out.println("PISTOLA AGUAAAAAAAAAA, SQUERO SQUERO");
    }
}
