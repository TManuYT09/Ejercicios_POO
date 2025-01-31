package org.example.casa;

public class Electrodomestico {
    private String nombre;
    private double consumo;

    public Electrodomestico(String nombre, double consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Electrodomestico : [ nombre="+getNombre()+" consumo="+getConsumo()+"kWh";
    }
}
