package org.example.pruebas_lombok;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Estudiante {
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
}
