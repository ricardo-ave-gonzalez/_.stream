package com.example.demo.exercises;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ToString
class EstrucGrande {
    public String a = "a";
    public String b = "b";
    public String c = "c";
    public String d = "d";
    public String e = "e";
    public String f = "f";
}

@Builder
@ToString
class LetraC {
    public String c = "x";
}

@Builder
@ToString
class Color {
    public String color;
}

public class WorkExample {
    /**
     * (la premisa)
     * - Si todos están en verde: VERDE
     * - Si todos están en rojo: ROJO
     * - Cualquier otra opción: AMARILLO.
     */
    public static void main(String... args) {
        List<EstrucGrande> structGrande = new ArrayList<EstrucGrande>();
        structGrande.add(new EstrucGrande());
        structGrande.add(new EstrucGrande());
        structGrande.add(new EstrucGrande());
        structGrande.add(new EstrucGrande());
        structGrande.add(new EstrucGrande());
        structGrande.add(new EstrucGrande());
        structGrande.add(new EstrucGrande());
        structGrande.add(new EstrucGrande());

        var strChica = structGrande
                .stream()
                .map(z -> new LetraC(z.c))
                .collect(Collectors.toList());
        System.out.println(new Gson().toJson(strChica));

        var colores = new ArrayList<Color>();

        colores.add(new Color("Amarillo"));
        colores.add(new Color("Rojo"));
        colores.add(new Color("Amarillo"));
        colores.add(new Color("Amarillo"));
        colores.add(new Color("Verde"));
        colores.add(new Color("Amarillo"));

        var colorResultante = "Amarillo";

        var todoVerde = (colores.stream().filter(z -> z.color.equals("Verde")).count() == colores.size());
        var todoRojo = (colores.stream().filter(z -> z.color.equals("Rojo")).count() == colores.size());

        colorResultante = (todoVerde) ? "VERDE" : colorResultante;
        colorResultante = (todoRojo) ? "ROJO" : colorResultante;

        System.out.println(colorResultante);
    }
}
