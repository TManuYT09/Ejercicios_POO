package org.example.tema6.practica2;

public class Masajista extends MutxamelIFC{
    private String titulacion;
    private int anosExperiencia;

    public Masajista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println("Dando masaje a "+ jugador.getNombre());
    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }
}
