package com.example.demo.exercises;

import com.example.demo.mockdata.MockData;
import com.example.demo.models.Auto;;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtracion {

    public static void dropWhile() throws Exception {
        System.out.println("usando filter");
        Stream.of(2, 4, 6, 8, 9, 10, 12).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("using dropWhile");
        Stream.of(2, 4, 6, 8, 9, 10, 12).dropWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

    }

    public static void main(String[] args) throws Exception {
        
        List<Auto> autos = MockData.obtenerAutos();

        Predicate<Auto> autoPredicate = z -> z.precio < 20000.00;
        Predicate<Auto> yellow = z -> z.color == "Yellow";

        List<Auto> autosFiltrados = autos.stream()
                //.filter(autoPredicate)
                .filter(yellow)
                .collect(Collectors.toList());

        autosFiltrados.forEach(System.out::println);

        dropWhile();


    }
}
