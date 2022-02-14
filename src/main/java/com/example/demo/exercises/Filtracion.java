package com.example.demo.exercises;

import com.example.demo.mockdata.MockData;
import com.example.demo.models.Auto;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtracion {

    public static void main(String[] args) throws Exception {
        
        List<Auto> autos = MockData.obtenerAutos();

        Predicate<Auto> autoPredicate = z -> z.precio < 20_000.00;
        Predicate<Auto> yellow = z -> z.color == "Yellow";

        List<Auto> autosFiltrados = autos.stream()
                .filter(autoPredicate)
                .filter(yellow)
                .collect(Collectors.toList());

        autosFiltrados.forEach(System.out::println);
        System.out.println(autos);
        System.out.println("que pasa");
    }
}
