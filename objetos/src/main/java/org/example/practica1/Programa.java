package org.example.practica1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, String director){
        this.nombre=nombre;
        this.cadena=cadena;
        temporadas=0;
        listaEmpleados=new ArrayList<>();
        listaInvitados=new ArrayList<>();
        if (director!=null){
            insertarEmpleado(director,"director");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public void invitadosTemporada(int temporada){
        int cant=0;
        for (Invitado inv:listaInvitados){
            if (inv.getTemporada() == temporada){
                cant++;
            }
        }
        System.out.println("Han salido "+cant+" invitados en la temporada "+temporada);
        System.out.println("Los invitados son:");
        for (Invitado inv:listaInvitados){
            if (inv.getTemporada()==temporada){
                System.out.println(inv.getNombre()+" cuya profesión es "+inv.getProfesion());
            }
        }
    }

    public int vecesInvitado(String nombre){
        int cant=0;
        for (Invitado inv:listaInvitados){
            if (inv.getNombre().equals(nombre)){
                cant++;
            }
        }
        return cant;
    }

    public void rastrearInvitado(String nombre){
        System.out.println(nombre+" fue "+vecesInvitado(nombre));
        System.out.println("Asistio en las fechas: ");
        for (Invitado inv:listaInvitados){
            if (inv.getNombre().equals(nombre)){
                System.out.println("\t-"+inv.getFecha_visita());
            }
        }

        System.out.println("En las temporadas: ");
        for (Invitado inv:listaInvitados){
            if (inv.getNombre().equals(nombre)){
                System.out.println("\t-"+inv.getTemporada()+"º temporada");
            }
        }
    }

    public boolean buscarInvitado(String nombre){
        for (Invitado inv:listaInvitados){
            if (inv.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    public void invitadoAntes(String nombre){
        if (buscarInvitado(nombre)){
            System.out.println(nombre+" acudio al programa");
        }else {
            System.out.println(nombre+" no acudio ningun programa");
        }
    }

    public void insertarEmpleado(String nombre, String cargo){
        Empleado empleado = new Empleado(nombre,cargo);
        if (cargo.equals("director")){
            director=empleado;
        }else {
            empleado.setDirector(director);
        }
        listaEmpleados.add(empleado);
    }

    public void insertarInvitado(String nombre, String profesion, int temporada){
        Invitado invitado = new Invitado(nombre,profesion, temporada);
        listaInvitados.add(invitado);
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
