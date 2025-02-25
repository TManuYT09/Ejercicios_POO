package org.example.tema6.practica2;

public class Masajista extends MutxamelIFC{
    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println("Dando masaje a "+ jugador.getNombre());
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre()+" concentrándose para el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOOOOL");
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", " +
                "Edad: " + getEdad() + ", " +
                "Titulo: " + titulacion + ", " +
                "Años de experiencia: " + anosExperiencia;
    }
}
