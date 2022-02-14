package com.example.demo.models;

import lombok.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PerdonaDTO {
    public Integer id;
    public String nombre;
    public Integer edad;
}
