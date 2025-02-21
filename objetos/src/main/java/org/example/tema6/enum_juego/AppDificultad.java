package org.example.tema6.enum_juego;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppDificultad {
    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Introduce la dificulta"+ Arrays.toString(Dificultad.values()));
        String dificultad=entrada.next().toUpperCase();
        Dificultad juego=Dificultad.valueOf(dificultad);
        int puntiacion= random.nextInt(0,5000);
        System.out.println("Puntuación obtenida="+puntiacion);
        System.out.println("Puntuación final="+puntiacion* juego.getMultiplicador());
    }
}
