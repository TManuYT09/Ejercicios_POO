package org.example.tema6.pokemon;

public class Planta extends Pokemon{

    public Planta(int nivel,int ps) {
        super(nivel,ps);
    }

    @Override
    public void atacar() {
        System.out.println("LÁTIGO CEPAAAAAAAAAAAAAAA");
    }
}
