package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Persona persona1=new Persona("Pepe", "Sanchéz", "12345678A", 80, 30, "Madrid", "Persiana");
        Persona persona2=new Persona();

        persona1.imprimirInfoPersona();
        persona2.imprimirInfoPersona();
        System.out.println(persona1.concatenar());

        System.out.println("Antes: " + persona1.getNombre());
        persona1.setNombre("Pepa");
        System.out.println("Despues: " + persona1.getNombre());
        persona1.setNombre("messi");
        System.out.println("Madrit: " + persona1.getNombre());*/

        /*Clase Televisor*/
        /*Televisor canal=new Televisor(1,5);

        System.out.println(canal.getCanal());
        System.out.println(canal.getVolumen());

        canal.setCanal(10);
        canal.setVolumen(20);
        canal.setCanal(100);
        canal.setVolumen(1000);

        canal.bajarCanal();
        System.out.println(canal.getCanal());
        canal.subirCanal();
        System.out.println(canal.getCanal());*/

        /*Clase Paciente*/
//        Paciente paciente_fit = new Paciente("Llados", 40, 'M', 130.0F, 1.7F);
//        paciente_fit.mostrarInfoPaciente();
//        Paciente paciente_fav = new Paciente();
//        paciente_fav.mostrarInfoPaciente();
//        Paciente paciente_pov = new Paciente("Boix",18,'H');
//        paciente_pov.mostrarInfoPaciente();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = teclado.next();
        System.out.println("Introduce la edad: ");
        int edad = teclado.nextInt();
        System.out.println("Introduce tu sexo: ");
        char genero = teclado.next().charAt(0);
        System.out.println("Introduce tu peso: ");
        float peso = teclado.nextFloat();
        System.out.println("Introduce tu altura: ");
        float altura = teclado.nextFloat();

        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente(nombre, edad, genero);
        Paciente paciente3 = new Paciente(nombre, edad, genero, peso, altura);

        paciente1.setNombre("Paco");
        paciente1.setEdad(35);
        paciente1.setSexo('M');
        paciente1.setPeso(87);
        paciente1.setAltura(1.95F);

        comprobarPeso(paciente1);
        comprobarPeso(paciente2);
        comprobarPeso(paciente3);

        mayorEdad(paciente1);
        mayorEdad(paciente2);
        mayorEdad(paciente3);

    }
    public static void comprobarPeso(Paciente paciente){
        int imc = paciente.calcularIMC();

        switch (imc){
            case Paciente.PESO_BAJO:
                System.out.println("La persona "+paciente.getNombre()+" esta por debajo de su peso ideal");
                break;
            case Paciente.PESO_IDEAL:
                System.out.println("La persona "+paciente.getNombre()+" esta en su peso ideal");
                break;
            case Paciente.SOBREPESO:
                System.out.println("La persona "+paciente.getNombre()+" esta por encima de su peso ideal");
                break;
        }
    }

    public static void mayorEdad(Paciente paciente){
        if (paciente.esMayorDeEdad()){
            System.out.println("La persona "+paciente.getNombre()+" es mayor de edad.");
        }else {
            System.out.println("La persona "+paciente.getNombre()+" es menor de edad.");
        }
    }
}