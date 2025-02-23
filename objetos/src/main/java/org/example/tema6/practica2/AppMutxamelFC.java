package org.example.tema6.practica2;

public class AppMutxamelFC {
    public static void main(String[] args) {
        // crear varios jugadores para el equipo SENIOR
        Jugador jugadorSenior1 = new Jugador(Equipos.SENIOR,1,Posiciones.PORTERO);
        Jugador jugadorSenior2 = new Jugador(Equipos.SENIOR,2,Posiciones.CENTROCAMPISTA);
        Jugador jugadorSenior3 = new Jugador(Equipos.SENIOR,3,Posiciones.DEFENSA);
        Jugador jugadorSenior4 = new Jugador(Equipos.SENIOR,4,Posiciones.DELANTERO);

        // crear al entrenador del equipo SENIOR
        Entrenador entrenadorSenior = new Entrenador(Equipos.SENIOR, "4-3-3");

        // crear a los masajistas del club
        Masajista masajistaSenior = new Masajista("Masajatron", 7);

        // crear a algún acompañante para un par de jugadores
        Acompañante acompañanteSenior2 = new Acompañante(jugadorSenior2, "Primo vigésimo");
        Acompañante acompañanteSenior4 = new Acompañante(jugadorSenior4, "Tia quinta");

        // concentrarse()

        // entrenar()

        // darMasaje() a algún jugador
        masajistaSenior.darMasaje(jugadorSenior1);

        // viajar() a Madrid

        // planificarEntrenamiento()
        entrenadorSenior.planificarEntrenamiento();

        // entrenar()

        // descansar()

        // calentar()

        // jugarPartido()

        // animarEquipo()

        // hacerCambios()

        // marcarGol()

        // celebrarGol()

        // darMasaje() a varios jugadores

        // viajar() a Mutxamel

        // descansar()

    }
}
