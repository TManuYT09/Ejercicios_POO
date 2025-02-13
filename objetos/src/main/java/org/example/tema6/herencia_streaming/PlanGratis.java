package org.example.tema6.herencia_streaming;

public class PlanGratis extends Suscripcion{
    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios.");
    }

    @Override
    void obtenerPeriodoPrueba() {
        System.out.println("Sin periodo de prueba");
    }
}
