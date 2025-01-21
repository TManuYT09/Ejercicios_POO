package org.example;

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
        Paciente paciente_fit = new Paciente("Llados", 40, 'M', 130.0F, 1.7F);
        paciente_fit.mostrarInfoPaciente();
        Paciente paciente_fav = new Paciente();
        paciente_fav.mostrarInfoPaciente();
        Paciente paciente_pov = new Paciente("Boix",18,'H');
        paciente_pov.mostrarInfoPaciente();
    }
}