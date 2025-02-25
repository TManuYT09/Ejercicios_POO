package org.example.tema6.practica2;

public class AppMutxamelFC {
    public static void main(String[] args) {
        // crear varios jugadores para el equipo SENIOR
        Jugador jugadorSenior1 = new Jugador("Benji", 21, Equipos.SENIOR,1,Posiciones.PORTERO);
        Jugador jugadorSenior2 = new Jugador("Mark", 22, Equipos.SENIOR,2,Posiciones.CENTROCAMPISTA);
        Jugador jugadorSenior3 = new Jugador("Bruce", 20, Equipos.SENIOR,3,Posiciones.DEFENSA);
        Jugador jugadorSenior4 = new Jugador("Oliver", 20, Equipos.SENIOR,4,Posiciones.DELANTERO);

        // crear al entrenador del equipo SENIOR
        Entrenador entrenadorSenior = new Entrenador("Roberto", 40,Equipos.SENIOR, "4-3-3");

        // crear a los masajistas del club
        Masajista masajistaSenior = new Masajista("Becky", 20,"Masajatron", 7);

        // crear a algún acompañante para un par de jugadores
        Acompañante acompañanteSenior2 = new Acompañante("Escolti",21,jugadorSenior2, "Primo vigésimo");
        Acompañante acompañanteSenior4 = new Acompañante("Maria-Antoñera", 50,jugadorSenior4, "Tia quinta");

        // concentrarse()
        jugadorSenior3.concentrarse();
        // entrenar()
        jugadorSenior1.entrenar();
        // darMasaje() a algún jugador
        masajistaSenior.darMasaje(jugadorSenior1);
        // viajar() a Madrid
        entrenadorSenior.viajar("Madrid");
        // planificarEntrenamiento()
        entrenadorSenior.planificarEntrenamiento();
        // entrenar()
        jugadorSenior1.entrenar();
        // descansar()
        jugadorSenior1.descansar();
        // calentar()
        jugadorSenior2.calentar();
        // jugarPartido()
        jugadorSenior3.jugarPartido("Betis");
        // animarEquipo()
        acompañanteSenior4.animarEquipo();
        // hacerCambios()
        entrenadorSenior.hacerCambios("4-2-3");
        // marcarGol()
        jugadorSenior4.marcarGol();
        // celebrarGol()
        acompañanteSenior4.celebrarGol();
        // darMasaje() a varios jugadores
        masajistaSenior.darMasaje(jugadorSenior1);
        masajistaSenior.darMasaje(jugadorSenior4);
        // viajar() a Mutxamel
        jugadorSenior3.viajar("Mutxamel");
        // descansar()
        jugadorSenior2.descansar();
    }
}
