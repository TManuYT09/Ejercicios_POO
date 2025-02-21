package org.example.tema6.excepciones_cajero;

import java.util.Scanner;

public class AppCajero {
    static Scanner entrada=new Scanner(System.in);

    public static void main(String[] args) {
        boolean ejecucion=true;
        CuentaBancaria cuenta=new CuentaBancaria(500.0);

        do {
            MenuCajero();
            System.out.print("\tSelecciona una opción: ");
            String opcion=entrada.next();
            System.out.println();
            switch (opcion){
                case "1":
                    cuenta.consultaSaldo();
                    break;
                case "2":
                    System.out.print("Introduce el importe a ingresar: ");
                    double ingreso=entrada.nextDouble();
                    cuenta.ingresarSaldo(ingreso);
                    break;
                case "3":
                    System.out.print("Introduce el importe a retirar: ");
                    double retiro=entrada.nextDouble();
                    cuenta.retirarSaldo(retiro);
                    break;
                case "X":
                    ejecucion=false;
                    break;
            }
            System.out.println();
        }while(ejecucion);
    }

    public static void MenuCajero(){
        System.out.println("=== Cajero Automático ===");
        System.out.println();
        System.out.println("\t[1]. Consultar saldo");
        System.out.println("\t[2]. Ingresar dinero");
        System.out.println("\t[3]. Retirar dinero");
        System.out.println("\t[X]. Salir");
    }
}
