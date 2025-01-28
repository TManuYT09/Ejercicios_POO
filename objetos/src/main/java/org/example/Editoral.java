package org.example;

public class Editoral {
    private String nombre;
    private String pais;

    public Editoral(String nombre, String pais){
        this.nombre=nombre;
        this.pais=pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString(){
        return "Editorial : [nombre="+getNombre()+" pais="+getPais()+" ]";
    }
}
