package org.example.pruebas_lombok;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Curso {
    @NonNull
    private String nombre;
    private int horas;
}
