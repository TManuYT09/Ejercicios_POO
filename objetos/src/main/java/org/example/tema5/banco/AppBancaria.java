package org.example.tema5.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBancaria {
    private static ArrayList<Cliente> listaClientes;
    private static ArrayList<Cuenta> listaCuentas;
    public static void main(String[] args){
        listaClientes=new ArrayList<>();
        listaCuentas=new ArrayList<>();
        opcionInicio();
    }
    private static String escribirString(){
        Scanner entrada=new Scanner(System.in);
        return entrada.nextLine();
    }
    private static void menuPrincipal(){
        System.out.println("MENÚ PRINCIPAL:");
        System.out.println("\t[1] Mantenimiento de Clientes");
        System.out.println("\t[2] Mantenimiento de Cuentas");
        System.out.println("\t[X] Salir");
    }
    private static void menuCliente(){
        System.out.println("CLIENTES:");
        System.out.println("\t[1] Altas");
        System.out.println("\t[2] Bajas");
        System.out.println("\t[3] Modificaciones");
        System.out.println("\t[4] Listado de clientes");
        System.out.println("\t[X] Volver al menú");
    }
    private static void opcionInicio(){
        do {
            menuPrincipal();
            String opc;
            opc=escribirString();

            switch (opc.toUpperCase()){
                case "1": opcionCliente(); break;
                case "2": break;
                case "X": System.out.println("Cerrando programa"); System.exit(0); break;
                default: System.out.println("ERROR: opción no valida"); break;
            }
        }while (true);
    }
    private static void eliminarCliente(){
        System.out.println("Introduce el nombre del cliente que quieres eliminar");
        String nombre=escribirString();
        System.out.println("Ahora los apellidos");
        String apellidos=escribirString();

        for (Cliente clie:listaClientes){
            if (clie.getNombre().equals(nombre) && clie.getApellidos().equals(apellidos)){
                listaClientes.remove(clie.getId());
            }
        }
    }

    private static void opcionCliente(){
        do {
            menuCliente();
            String opc=escribirString();
            switch(opc.toUpperCase()){
                case "1": Cliente cli=new Cliente(); listaClientes.add(cli); break;
                case "2": eliminarCliente(); break;
                case "3": break;
                case "4": break;
                case "X": System.out.println("Saliendo..."); opcionInicio(); break;
                default: System.out.println("EROR: opción no valida"); break;
            }
        }while (true);
    }
}
