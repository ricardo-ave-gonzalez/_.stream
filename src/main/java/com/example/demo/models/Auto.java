package com.example.demo.models;

import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Auto {
    public Integer id;
    public String marca;
    public String modelo;
    public String color;
    public Integer año;
    public Double precio;
}
