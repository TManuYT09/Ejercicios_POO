package org.example;

import java.util.Random;

public class Paciente {
    private final static char SEXO_DEF = 'X';

    private String nombre;
    private String dni;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;

    public Paciente(String nombre, int edad, char sexo, float peso, float altura){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
        generarDNI();
    }

    public Paciente(){
//        generarDNI();
//        this.sexo=SEXO_DEF;
        this("",0,SEXO_DEF,0,0);
    }

    public Paciente(String nombre, int edad, char sexo){
        this(nombre,edad,sexo,0,0);
    }

    private void generarDNI(){
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(10000000,99999999);
        char letras[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto=numero%23;

        this.dni=Integer.toString(numero)+letras[resto];
    }

    public void mostrarInfoPaciente(){
        System.out.println("Paciente: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Género: "+this.sexo);
        System.out.println("DNI: "+this.dni);
        System.out.println("Peso: "+this.peso);
        System.out.println("Altura: "+this.altura);
        System.out.println(" ");
    }

}
