package org.example.tema6.practica2;

public class Entrenador extends MutxamelIFC implements AccionesDeportivas{
    private static final String FOMACION_FORMATO= "^[0-9]-[0-9]-[0-9]$";

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(Equipos equipo, String formacionPreferida) {
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
    }

    public void planificarEntrenamiento(){

    }

    public void hacerCambios(String formacion){

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

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }

    public void setFormacionPreferida(String formacionPreferida) {
        if (formacionPreferida.matches(FOMACION_FORMATO)){
            this.formacionPreferida = formacionPreferida;
        }else {
            throw new FormacionFormatoException();
        }

    }
}
