package org.example.tema6.herencia_festival;

class Artista extends Persona {

    String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) throws EdadMinimaException {
        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género Musical: " + generoMusical);
    }

    public void accederEvento(){
        System.out.println("Accediendo como Asistente: Buscando asiento.");
    }
}