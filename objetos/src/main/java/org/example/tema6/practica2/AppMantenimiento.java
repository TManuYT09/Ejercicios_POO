package org.example.tema6.practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {
    static Scanner entrada=new Scanner(System.in);

    public static ArrayList<Masajista> listaMasajistas = new ArrayList<>();

    public static void main(String[] args) {
        boolean bucle = true;

        do {
            imprimirMenuInicio();
            switch (seleccionarOpcion().toUpperCase()){
                case "3":
                    mantenimientoMasajista();
                    break;
                case "4":
                    consultarEquipos();
                    break;
                case "X":
                    System.out.println("Cerrando programa...");
                    bucle=false;
                    break;
                default:
                    System.out.println("Opcion no configurada");
                    break;
            }
        }while (bucle);
    }

    public static void imprimirMenuInicio(){
        System.out.println();
        System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
        System.out.println();
        System.out.println("\t[1]. Mantenimiento de jugadores");
        System.out.println("\t\tDentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).");
        System.out.println("\t[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("\t\tDentro podremos añadir entrenadores y modificar sus datos.");
        System.out.println("\t[3]. Mantenimiento masajistas (añadir-modificar datos-salir)");
        System.out.println("\t\tDentro podremos añadir masajistas y modificar sus datos.");
        System.out.println("\t[4]. Consultar equipos");
        System.out.println("\t\tDentro se deben listar los tipos de equipos del club y elegir uno.");
        System.out.println("\t[X]. Salir");
        System.out.println();
        System.out.println("============================================");
        System.out.println();
    }

    public static String seleccionarOpcion(){
        System.out.print("Selecciona una opcion --> ");
        return entrada.next();
    }

    /*Opcion 1*/
    /*Opcion 2*/

    /*Opcion 3*/
    public static void mantenimientoMasajista(){
        boolean comp=true;

        do {
            imprimirMenuMasaje();
            switch (seleccionarOpcion()){
                case "1":
                    anadirMasajista();
                    break;
                case "2":
                    modificarMasaje();
                    break;
                case "X":
                    System.out.println("Saliendo de la ventana de mantenimiento...");
                    comp=false;
                    break;
                default:
                    System.out.println("Opcion no configurada");
                    break;
            }
        }while (comp);
    }

    public static void imprimirMenuMasaje(){
        System.out.println();
        System.out.println("=== Mantenimiento de Masajistas ===");
        System.out.println();
        System.out.println("\t[1]. Añadir nuevo masajista");
        System.out.println("\t[2]. Modificar datos de masajista existente");
        System.out.println("\t[X]. Salir");
        System.out.println();
        System.out.println("===================================");
        System.out.println();
    }

    public static void anadirMasajista(){
        System.out.println("¿Como se llama el masajista?");
        String nombre=entrada.next();
        System.out.println("¿Cuantos años tiene?");
        int edad=entrada.nextInt();
        System.out.println("¿Que titulo tiene?");
        String titulo=entrada.next();
        System.out.println("¿Cuantos años de experiencia posee?");
        int anosExperiencia = entrada.nextInt();

        listaMasajistas.add(new Masajista(nombre,edad,titulo,anosExperiencia));
    }

    public static void modificarMasaje(){
        menuModificarMasaje();

        String opct = seleccionarOpcion();
        int opc = Integer.parseInt(opct);

        System.out.println();

        if (opc<listaMasajistas.size()){
            menuModificarMasajeElegir(opc);

            String opcion = seleccionarOpcion();

            switch (opcion.toLowerCase()){
                case "nombre":
                    menuModificarMasajeElegir(opc);
                    System.out.print("Nuevo nombre --> ");
                    String nombre=entrada.next();
                    listaMasajistas.get(opc).setNombre(nombre);
                    System.out.println("Se cambiado el nombre correctamente");
                    break;
                case "edad":
                    menuModificarMasajeElegir(opc);
                    System.out.print("Nueva edad --> ");
                    int edad=entrada.nextInt();
                    listaMasajistas.get(opc).setEdad(edad);
                    System.out.println("Se cambiado la edad correctamente");
                    break;
                case "titulo":
                    menuModificarMasajeElegir(opc);
                    System.out.print("Nuevo titulo --> ");
                    String titutol=entrada.next();
                    listaMasajistas.get(opc).setTitulacion(titutol);
                    System.out.println("Se cambiado el titulo correctamente");
                    break;
                case "añosexperiencia":
                    menuModificarMasajeElegir(opc);
                    System.out.print("Nuevos años de experiencia --> ");
                    int anos=entrada.nextInt();
                    listaMasajistas.get(opc).setAnosExperiencia(anos);
                    System.out.println("Se cambiado los años de experiencia correctamente");
                default:
                    System.out.println("Opcion no existente");
                    break;
            }

        } else {
            System.out.println("El masajista elejido no existe");
        }
    }

    public static void menuModificarMasaje(){
        System.out.println();
        System.out.println("=== Mantenimiento de Masajistas. Modificar datos de masajista existente ===");
        System.out.println();
        System.out.println("¿De qué masajista quieres hacer cambios?");
        System.out.println();

        int cant=0;
        for (Masajista masajista : listaMasajistas){

            System.out.println("["+cant+", "+masajista+"]");
            cant++;
        }

        System.out.println();
        System.out.println("============================================================================");
        System.out.println();
    }

    public static void menuModificarMasajeElegir(int opc){
        System.out.println("=== Mantenimiento de Masajistas. Modificar datos de masajista existente ===");
        System.out.println();
        System.out.println("["+listaMasajistas.get(opc)+"]");
        System.out.println();
        System.out.println("¿Qué quieres modificar? [nombre,edad,titulo,añosExperiencia]");
        System.out.println();
        System.out.println("============================================================================");
        System.out.println();
    }

    /*Opcion 4*/
    public static void menuConsulta(){
        System.out.println("=== Consultar equipo ===");
        System.out.println();
        for (Equipos equipo : Equipos.values()){
            System.out.print(equipo+", ");
        }
        System.out.println();
        System.out.println("========================");
    }

    public static void consultarEquipos(){
        menuConsulta();
    }
}
