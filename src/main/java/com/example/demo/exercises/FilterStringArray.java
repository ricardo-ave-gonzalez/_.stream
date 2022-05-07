package com.example.demo.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, ingrese cualquier palabra separada por espacio: ");
        String userInput = sc.nextLine();
        System.out.print("Por favor, ingrese la longitud mínima de palabra para filtrar palabras: ");
        int minLength = sc.nextInt();

        String[] words = userInput.split("\\s+");
        String[] palabraFriltrada = filtrarPalabraPorLongitud(minLength, words);
        System.out.println(Arrays.toString(palabraFriltrada));
    }



    public static String[] filtrarPalabraPorLongitud(int minLength, String[] palabras) {
        String[] arregloFiltrado = new String[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= minLength) {
                arregloFiltrado[i] = palabras[i];
            }
        }

        arregloFiltrado = filterNulls(arregloFiltrado);

        return arregloFiltrado;
    }



    private static String[] filterNulls(String[] arr) {
        int newArraySize = 0;
        for (String palabra : arr) {
            if (palabra != null) {
                newArraySize++;
            }
        }

        String[] filteredArray = new String[newArraySize];

        int filteredArrayIndex = 0;
        for (String palabra : arr) {
            if (palabra != null) {
                filteredArray[filteredArrayIndex++] = palabra;
            }
        }

        return filteredArray;
    }



    //===================== SOLUTION WITH STREAM API

    public static String[] filterWordsByLengthStreamApi(int minLength, String[] palabras) {
        return Arrays.stream(palabras)
                .filter(s -> s.length() >= minLength)
                .toArray(String[]::new);
    }

}
