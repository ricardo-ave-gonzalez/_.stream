package com.example.demo.exercises;

import com.example.demo.mockdata.MockData;

import java.util.List;
import java.util.stream.Collectors;

public class Work {

    public static void solicitarEmail() throws Exception {
        List<String> emails = MockData.obtenerPersonas()
                .stream()
                .map(z -> z.email)
                .collect(Collectors.toList());

        emails.forEach(System.out::println);
    }

    public static void main(String[] args) throws Exception {
        solicitarEmail();

        System.out.println(
                MockData.obtenerAutos()
                        .stream()
                        .filter(z -> {
                            if (z.precio < 6000) {
                                System.out.println("los autos baratos son " + z.marca + " $" + z.precio);
                            }
                            return false;
                        })
                        .collect(Collectors.toList())
        );


        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------  filtros...              ----------------------------");

        System.out.println(
                MockData.obtenerPersonas()
                        .stream()
                        .filter(z -> {
                            if (z.edad > 18 && z.edad < 35 && z.genero.equals("Female")) {
                                System.out.println(z.nombre + " de " + z.edad + " años, genero " + z.genero);
                            }
                            return false;
                        })
                        .collect(Collectors.toList())
        );
    }
}
