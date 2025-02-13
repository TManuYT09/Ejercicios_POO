package org.example.tema6.herencia_streaming;

public class PlataformaStreaming {
    public static void main(String[] args) {
        Suscripcion[] suscripcion={
                new PlanGratis("Gratis", 0.0),
                new PlanBasico("Básico", 9.99),
                new PlanPremium("Premium", 14.99),
                new PlanFamiliar("Familiar", 19.99)
        };

        for (Suscripcion susc:suscripcion){
            susc.mostrarInfo();
            susc.obtenerBeneficios();
            susc.obtenerPeriodoPrueba();
        }
    }
}
