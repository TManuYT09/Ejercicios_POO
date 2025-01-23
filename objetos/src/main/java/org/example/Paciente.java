package org.example;

import java.util.Random;

public class Paciente {
    private final static char SEXO_DEF = 'X';
    public final static int SOBREPESO = 1;
    public final static int PESO_BAJO = -1;
    public final static int PESO_IDEAL = 0;
    public final static int MAYOR_EDAD = 18;


    private String nombre;
    private String dni;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;

    public Paciente(String nombre, int edad, char sexo, float peso, float altura){
        this.nombre=nombre;
        this.edad=edad;
        setSexo(sexo);
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

    public int calcularIMC(){
        double imc = peso/(Math.pow(altura,2));

        if(imc < 20){
            return PESO_BAJO;
        } else if (imc > 25) {
            return SOBREPESO;
        }else {
            return PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad(){
        if (edad>MAYOR_EDAD){
            return true;
        }
        return false;
    }

    private void comprobarSexo(char sexo){
        if (sexo != 'H' && sexo != 'M'){
            this.sexo=SEXO_DEF;
        }else{
            this.sexo=sexo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getDni() {
        return dni;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
