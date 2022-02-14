package com.example.demo.models;

import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    public Integer id;
    public String nombre;
    public String apellido;
    public String email;
    public String genero;
    public Integer edad;
}
