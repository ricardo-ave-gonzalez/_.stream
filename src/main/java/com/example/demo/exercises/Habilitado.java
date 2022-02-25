package com.example.demo.exercises;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
class Model{
    public long ts = Calendar.getInstance().getTimeInMillis();
    public String data;
    public boolean enable;
}

public class Habilitado {

    public static void main(String[] args) {

        List<Model> modelos = new ArrayList<>();
        modelos.add(new Model(System.currentTimeMillis(),"item 1",true));
        modelos.add(new Model(System.currentTimeMillis(),"item 2",true));
        modelos.add(new Model(System.currentTimeMillis(),"item 3",false));
        modelos.add(new Model(System.currentTimeMillis(),"item 4",true));
        modelos.add(new Model(System.currentTimeMillis(),"item 5",false));

        var habilitado = modelos
                .stream()
                .filter(z -> z.enable == true)
                .collect(Collectors.toList());
        System.out.println(new Gson().toJson(habilitado));
    }
}
