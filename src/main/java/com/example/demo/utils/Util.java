package com.example.demo.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Util {
    public static void controlarError(Runnable porcionCodigo) {
        try {
            porcionCodigo.run();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static String genPass() {
        int digit = 10;

        String lowerCases = "qwertyuiopasdfghjklzxcvbnm";
        String upperCases = "QWERTYUIOPASDFGHJKLZXCVBNM";

        String password = "";

        for (int i = 0; i < digit; i++) {
            int aleatorio = (int) (3 * Math.random());

            switch (aleatorio) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    aleatorio = (int) (lowerCases.length() * Math.random());
                    password += String.valueOf(lowerCases.charAt(aleatorio));
                    break;
                case 2:
                    aleatorio = (int) (upperCases.length() * Math.random());
                    password += String.valueOf(upperCases.charAt(aleatorio));
                    break;
            }
        }
        return password;
    }
}
