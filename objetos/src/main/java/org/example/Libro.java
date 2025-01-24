package org.example;

public class Libro {

    private static int cantidadLibros=0;
    private static int librosDisponibles=0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;

    public Libro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        disponible=true;
        cantidadLibros++;
        librosDisponibles++;
        calcularId();
    }

    public void calcularId(){
        if (cantidadLibros<10){
            setId("LIB00"+cantidadLibros);
        } else if (cantidadLibros<100) {
            setId("LIB0"+cantidadLibros);
        } else if (cantidadLibros<1000) {
            setId("LIB"+cantidadLibros);
        }
    }

    public void prestar(){
        if (disponible){
            disponible=false;
            System.out.println("El libro "+getTitulo()+" ha sido prestado con éxito.");
            librosDisponibles--;
        }else {
            System.out.println("El libro "+getTitulo()+" no se puede prestar (no disponible)");
        }
    }

    public void devolver(){
        if (!disponible){
            disponible=true;
            System.out.println("El libro "+getTitulo()+" ha sido devuelto con éxito.");
            librosDisponibles++;
        }else {
            System.out.println("El libro "+getTitulo()+" no se puede devolver (disponible)");
        }
    }

    public boolean estaDisponible(){
        return getDisponible();
    }

    public static int getCantidadLibros() {
        return cantidadLibros;
    }

    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getId() {
        return id;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setId(String id) {
        this.id=id;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString(){
        return "Libro : [ titulo="+getTitulo()+" tutor="+getAutor()+" id="+getId()+" disponible="+estaDisponible()+" ]";
    }
}
