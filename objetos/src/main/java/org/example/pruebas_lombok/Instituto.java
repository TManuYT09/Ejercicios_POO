package org.example.pruebas_lombok;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@AllArgsConstructor
@Getter @Setter
public class Instituto {

    @NonNull
    private String nombre;
    private ArrayList<Estudiante> listaEstudiante;
    private ArrayList<Curso> listaCurso;

    public Instituto(String nombre){
        this.nombre = Objects.requireNonNull(nombre,"Instituto sin nombre");
        listaCurso=new ArrayList<>();
        listaEstudiante=new ArrayList<>();
    }

    public void agregarCurso(Curso cursos){
        if (cursos!=null){
            Curso curso=new Curso(cursos.getNombre(),cursos.getHoras());
            listaCurso.add(curso);
        }else {
            System.out.println("No se puede agregar a un curso nulo.");
        }
    }

    public void agregarEstudiante(Estudiante estudiantes){
        if (estudiantes!=null){
            Estudiante estudiante=new Estudiante(estudiantes.getNombre(),estudiantes.getEdad(),estudiantes.getCurso());
            listaEstudiante.add(estudiante);
        }else {
            System.out.println("No se puede agregar a un estudiante nulo.");
        }

    }
}
