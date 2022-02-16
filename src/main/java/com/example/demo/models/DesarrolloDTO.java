package com.example.demo.models;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DesarrolloDTO {
    public String id;
    public String documento;
    public String subcategoria;
    public PersonaDTO persona;
    public String fechaDeCarga;
    public String fechaDeVto;
    public Estado estado;
    public String aprobadoPor;
    public String observaciones;
}
