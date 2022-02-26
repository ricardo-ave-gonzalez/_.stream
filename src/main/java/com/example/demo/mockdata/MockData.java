package com.example.demo.mockdata;

import com.example.demo.models.DesarrolloDTO;
import com.example.demo.models.Persona;
import com.example.demo.models.Auto;
import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MockData {
  public static List<Persona> obtenerPersonas() throws IOException {
        InputStream inputStream = Resources.getResource("personas.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Persona>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public static List<Auto> obtenerAutos() throws IOException {
        InputStream inputStream = Resources.getResource("autos.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Auto>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public static List<DesarrolloDTO> obtenerListado() throws IOException {
      InputStream inputStream = Resources.getResource("desarrollo.json").openStream();
      String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
      Type listType = new TypeToken<ArrayList<DesarrolloDTO>>(){}.getType();
      return new Gson().fromJson(json, listType);
    }
}
