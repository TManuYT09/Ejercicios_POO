package org.example.tema5.practica1;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada){
        this.nombre=nombre;
        this.profesion=profesion;
        setFecha_visita();
        this.temporada=temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getTemporada() {
        return temporada;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void setFecha_visita() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿En que año va ir "+nombre+"?");
        int anyo=entrada.nextInt();
        System.out.println("¿En que mes?");
        int mes=entrada.nextInt();
        System.out.println("¿En que dia?");
        int dia=entrada.nextInt();

        this.fecha_visita = LocalDate.of(anyo,mes,dia);
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
