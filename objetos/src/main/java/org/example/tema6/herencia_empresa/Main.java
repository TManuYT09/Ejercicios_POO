package org.example.tema6.herencia_empresa;

import org.example.tema5.equipos.Persona;

public class Main {
    public static void main(String[] args){
        Empleado[] empleados={
                new Diseñador(),
                new Desarrollador(),
                new Gerente()
        };

        System.out.println("=== Usando el array polimórfico ===");
        for (Empleado emple:empleados){
            emple.realizarTarea();
        }

        Empleado desarrollador=new Desarrollador();
        Empleado gerente=new Gerente();

        System.out.println("=== Usando el método asignarTarea() ===");
        asignarTarea(gerente);
        asignarTarea(desarrollador);
    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
