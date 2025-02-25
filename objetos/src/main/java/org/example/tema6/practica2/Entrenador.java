package org.example.tema6.practica2;

public class Entrenador extends MutxamelIFC implements AccionesDeportivas{
    private static final String FOMACION_FORMATO= "^[0-9]-[0-9]-[0-9]$";

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
    }

    public void planificarEntrenamiento(){

    }

    public void hacerCambios(String formacion){
        if (!formacion.matches(FOMACION_FORMATO)){
            throw new FormacionFormatoException();
        }else {
            System.out.println("Cambia la formación a "+ formacion);
        }
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
    public void entrenar() {
        System.out.println(getNombre()+" esta celebrando un gol");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugando un partido contra "+rival);
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if (formacionPreferida.matches(FOMACION_FORMATO)){
            this.formacionPreferida = formacionPreferida;
        }else {
            throw new FormacionFormatoException();
        }

    }
}
