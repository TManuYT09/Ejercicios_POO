package org.example.tema6.practica1;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{
    public static final String FORMATO_TELEFONO="^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$";

    private String telefono;
    private int pin;

    public Bizum(String telefono){
        this.telefono=telefono;
        pin=generarPin();
        System.out.println(pin);
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con Bizum");
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    public int generarPin(){
        Random random=new Random();
        return random.nextInt(100000,999999);
    }

    public boolean validarBizum(){
        Scanner entrada=new Scanner(System.in);

        if (!telefono.matches(FORMATO_TELEFONO)){
            System.out.println("Error en el numero de telefono introducido");
            return false;
        }

        System.out.println("Introduzca el PIN:");
        int temp=entrada.nextInt();
        if (temp!=pin){
            return false;
        }

        return true;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
