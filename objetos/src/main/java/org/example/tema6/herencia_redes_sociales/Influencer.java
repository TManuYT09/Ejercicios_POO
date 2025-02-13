package org.example.tema6.herencia_redes_sociales;

import java.util.ArrayList;
import java.util.Arrays;

public class Influencer extends Usuario{
    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String usuario, int seguidores) {
        super(nombre, edad, usuario, seguidores);
        colaboraciones=new ArrayList<>();
    }

    public void anyadirColaboracion(String...colaboracion){
        colaboraciones.addAll(Arrays.asList(colaboracion));
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Colaboraciones: "+colaboraciones);
    }
}
