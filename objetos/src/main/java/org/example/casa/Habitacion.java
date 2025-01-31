package org.example.casa;

import java.util.ArrayList;

class Habitacion {
    private String nombre;
    private double metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados=metrosCuadrados;
        this.electrodomesticos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "Habitación : [ nombre="+getNombre()+" metros cuadrados="+getMetrosCuadrados()+" ]";
    }

    public void agregarElectrodomestico(String nombre, double consumo){
        for (Electrodomestico elec:electrodomesticos){
            if (elec.getNombre().equals(nombre)){
                System.out.println("El electrodomestico ya existe");
                return;
            }
        }

        Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo);
        electrodomesticos.add(electrodomestico);
    }

    public void mostrarElectrodomesticos(){
        System.out.println("Los electrodomesticos son:");
        for (Electrodomestico elec : electrodomesticos){
            System.out.println("- "+elec.getNombre()+", consume "+elec.getConsumo());
        }
    }

    public double calcularConsumo(){
        double res=0;
        for (Electrodomestico elec:electrodomesticos){
            res=res+elec.getConsumo();
        }
        return res;
    }
}
