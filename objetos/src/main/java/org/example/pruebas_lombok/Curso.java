package org.example.pruebas_lombok;

import lombok.*;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Curso {
    @NonNull
    private String nombre;
    private int horas;
}
