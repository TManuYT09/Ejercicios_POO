package org.example.pruebas_lombok;

import lombok.*;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Estudiante {
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
}
