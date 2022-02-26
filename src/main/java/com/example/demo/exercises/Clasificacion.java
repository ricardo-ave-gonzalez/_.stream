package com.example.demo.exercises;

import com.example.demo.mockdata.MockData;
import com.example.demo.models.Persona;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clasificacion {

    public static void clasificandoAlfabeticamente() throws Exception{
        List<Persona> personas = MockData.obtenerPersonas();
        List<String> clasificacion = personas.stream()
                .map(z -> z.nombre)
                .sorted()
                .collect(Collectors.toList());
        clasificacion.forEach(System.out::println);
    }

    public static void clasificandoAlfabeticamenteEnReversa() throws Exception {
        List<Persona> personas = MockData.obtenerPersonas();
        List<String> clasificacion = personas.stream()
                .map(z -> z.nombre)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        clasificacion.forEach(System.out::println);
    }

    public static void test() throws Exception {
        List<Persona> personas = MockData.obtenerPersonas();

        Comparator<Persona> comparator = Comparator
                .comparing(Persona::getEmail)
                .reversed()
                .thenComparing(Persona::getNombre);

        List<Persona> clasificacion = personas.stream()
                .sorted(comparator)
                .collect(Collectors.toList());

        clasificacion.forEach(System.out::println);
    }

    public static void main(String[] args) throws Exception {
        //clasificandoAlfabeticamente();
        //clasificandoAlfabeticamenteEnReversa();
        test();
    }
}
