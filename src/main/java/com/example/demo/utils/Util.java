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
}
