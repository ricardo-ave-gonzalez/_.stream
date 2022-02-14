package com.example.demo.exercises;

import com.example.demo.mockdata.MockData;
import com.example.demo.models.Auto;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Estadisticas {

    public static void autosCount() throws Exception {
        List<Auto> autos = MockData.obtenerAutos();
        long count = autos.stream()
                //.filter(z -> z.marca == "Ford")
                .filter(z -> z.año > 2010)
                .count();
        System.out.println("Se registraron " + count + " vehículos marca Ford");
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

    public static void autosPrecioTotal() throws Exception{
        List<Auto> autos = MockData.obtenerAutos();
        double total = autos.stream()
                .mapToDouble(z -> z.precio)
                .sum();
        System.out.println("La suma total de todos los vehículos es de " + total);
    }

    public static void autosPrecioEstadisticas() throws Exception {
        List<Auto> autos = MockData.obtenerAutos();
        DoubleSummaryStatistics statistics = autos.stream()
                .mapToDouble(z -> z.precio)
                .summaryStatistics();
        System.out.println(statistics.getCount());
        System.out.println(statistics.getMin());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getAverage());
        System.out.println(BigDecimal.valueOf(statistics.getSum()));
    }

    public static void main(String[] args) throws Exception {
        autosCount();
        autosPrecioMinimo();
        autosPrecioMaximo();
        autosPrecioPromedio();
        autosPrecioTotal();
        autosPrecioEstadisticas();
    }
}
