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

    public static void autosPrecioMinimo() throws Exception {
        List<Auto> autos = MockData.obtenerAutos();
        double min = autos.stream()
                .mapToDouble(z -> z.precio)
                .min()
                .orElse(0);
        System.out.println("El vehículo mas económico cuesta $" + min);
    }

    public static void autosPrecioMaximo() throws Exception{
        List<Auto> autos = MockData.obtenerAutos();
        double max = autos.stream()
                .mapToDouble(z -> z.precio)
                .max()
                .orElse(0);
        System.out.println("El vehículo mas caro cuesta $" + max);
    }

    public static void autosPrecioPromedio() throws Exception {
        List<Auto> autos = MockData.obtenerAutos();
        double promedio = autos.stream()
                .mapToDouble(z -> z.precio)
                .average()
                .orElse(0);
        System.out.println("El precio promedio es de " + promedio);
    }

    public static void main(String[] args) throws Exception {
        autosCount();
        autosPrecioMinimo();
        autosPrecioMaximo();
        autosPrecioPromedio();
    }
}
