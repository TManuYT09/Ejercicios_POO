package org.example.herencia_redes_sociales;

public class Usuario {
    private String nombre;
    private int edad;
    private String usuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String usuario, int seguidores){
        this.nombre=nombre;
        this.edad=edad;
        this.usuario=usuario;
        this.seguidores=seguidores;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Nombre de usuario: "+usuario);
        System.out.println("Numero de seguidores: "+seguidores);
    }
}
