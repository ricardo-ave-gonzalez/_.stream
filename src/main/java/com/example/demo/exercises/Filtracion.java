package com.example.demo.exercises;

public class Filtracion {

    /* public static void dropWhile() throws Exception {
        System.out.println("usando filter");
        Stream.of(2, 4, 6, 8, 9, 10, 12).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("using dropWhile");
        Stream.of(2, 4, 6, 8, 9, 10, 12).dropWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

    }

    public static void autosFiltrados() throws Exception {
        List<Auto> autos = MockData.obtenerAutos();
        Predicate<Auto> autoPredicate = z -> z.precio < 20000.00;
        Predicate<Auto> yellow = z -> z.color.equals("Yellow");

        List<Auto> autosFiltrados = autos.stream()
                .filter(autoPredicate)
                .filter(yellow)
                .collect(Collectors.toList());

        autosFiltrados.forEach(System.out::println);
    } */


}
