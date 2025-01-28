package org.example;

public class Libro {

    private static int cantidadLibros=0;
    private static int librosDisponibles=0;

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editoral editorial;

    public Libro(String titulo, String autor, Editoral editorial){
        this.titulo=titulo;
        this.autor=autor;
        cantidadLibros++;
        librosDisponibles++;
        calcularId();
        disponible=true;
        estudiantePrestado=null;
        this.editorial=editorial;
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

    public void prestar(Estudiante estudiante){
        if (disponible && estudiante.getLibroPresato() == null){
            disponible = false;
            System.out.println("El libro " + getTitulo() + " ha sido prestado con éxito" + " a " + estudiantePrestado.getNombre() + ".");
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.setLibroPresato(this);
        }else if (estudiante.getLibroPresato() != null){
            System.out.println("El estudiante "+estudiante.getNombre()+" ya tiene un libro prestado.");
        }else{
            System.out.println("El libro "+getTitulo()+" no se puede prestar (no disponible)");
        }
    }

    public void devolver(Estudiante estudiante){
        if (!disponible){
            disponible=true;
            System.out.println("El libro "+getTitulo()+" ha sido devuelto con éxito por "+ estudiantePrestado.getNombre());
            librosDisponibles++;
            estudiantePrestado=null;
            estudiante.setLibroPresato(null);

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

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public Editoral getEditorial() {
        return editorial;
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

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    public void setEditorial(Editoral editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString(){
        if (estudiantePrestado.getNombre()!=null){
            return "Libro : [ titulo="+getTitulo()+" tutor="+getAutor()+" id="+getId()+" disponible="+estaDisponible()+" editorial="+ getEditorial() +"]";
        }else {
            return "Libro : [ titulo="+getTitulo()+" tutor="+getAutor()+" id="+getId()+" disponible="+estaDisponible()+" ]";
        }


    }
}
