package org.example.casa;

import java.util.ArrayList;
import java.util.Scanner;

class Casa {
    Scanner teclado = new Scanner(System.in);
    private String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();
    }

    public void agregarHabitacion(String nombre, double metrosCuadrados) {
        for (Habitacion hab:habitaciones){
            if (hab.getNombre().equals(nombre)){
                System.out.println("La habitación ya existe");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre,metrosCuadrados); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en "+direccion+" tiene: "+habitaciones.size()+" habitaciones: ");
        for (Habitacion hab:habitaciones){
            System.out.println("- "+hab.getNombre()+" ("+hab.getMetrosCuadrados()+"m2)");
        }
        System.out.println("Propietario="+propietario);
    }

    public Habitacion getHabitacionMasGrande(){
        Habitacion mayor=habitaciones.get(0);

        for(Habitacion hab:habitaciones){
            if (hab.getMetrosCuadrados()> mayor.getMetrosCuadrados()){
                mayor=hab;
            }
        }

        return mayor;
    }

    public void eliminarHabitacion(String nombre){
        for (Habitacion hab : habitaciones){
            if (hab.getNombre().equals(nombre)){
                habitaciones.remove(hab);
                return;
            }
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Inserte propietari@:");
        String nombre = teclado.next();
        System.out.println("Edad del propietari@:");
        int edad = teclado.nextInt();
        this.propietario=new Propietario(nombre, edad);
    }

    @Override
    public String toString() {
        return "Casa{" +
                "habitaciones=" + habitaciones +
                ", propietario=" + propietario +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
