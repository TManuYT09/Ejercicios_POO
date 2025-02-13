package org.example.tema6.herencia_streaming;

public class PlanBasico extends Suscripcion{
    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    void obtenerBeneficios() {
        System.out.println("cceso a todo el contenido en calidad estándar sin anuncios.");
    }

    @Override
    void obtenerPeriodoPrueba() {
        System.out.println("30 días de prueba gratuita");
    }
}
