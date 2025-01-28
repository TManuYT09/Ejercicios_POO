package org.example;

import java.time.LocalDate;

public class Prestamo {


    private Estudiante estudiante;
    private Libro libro;
    private LocalDate fecha;

    public Prestamo(Estudiante estudiante, Libro libro){
        this.estudiante=estudiante;
        this.libro=libro;
        fecha=LocalDate.now();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString(){
        return "Prestamo : [ estdiante="+estudiante.getNombre()+" libro="+libro.getTitulo()+" fecha="+getFecha()+" ]";
    }
}
