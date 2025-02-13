package org.example.tema6.herencia_redes_sociales;

public class Basico extends Usuario{
    public Basico(String nombre, int edad, String usuario, int seguidores) {
        super(nombre, edad, usuario, seguidores);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
    }
}
