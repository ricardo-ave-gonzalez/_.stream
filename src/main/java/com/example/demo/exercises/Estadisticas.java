package com.example.demo.exercises;

import com.example.demo.mockdata.MockData;
import com.example.demo.models.Auto;

import java.util.List;

public class Estadisticas {

    public static void autosCount() throws Exception {
        List<Auto> autos = MockData.obtenerAutos();
        long count = autos.stream()
                //.filter(z -> z.marca == "Ford")
                .filter(z -> z.año > 2010)
                .count();
        System.out.println("Se registraron " + count + " vehículos");
    }

    public static void main(String[] args) throws Exception {
        autosCount();
    }
}
