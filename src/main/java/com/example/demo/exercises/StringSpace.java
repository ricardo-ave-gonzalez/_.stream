package com.example.demo.exercises;

public class StringSpace {
    public static void main(String... args) {
        String str = " Tortugas             Ninjas ";
        str = str.replaceAll("\\s+", "");
        System.out.println("String- " + str);
    }
}
