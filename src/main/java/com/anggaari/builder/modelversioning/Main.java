package com.anggaari.builder.modelversioning;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.setVersion(1.0);
        Gson gson = builder.create();

        // only field that set to 1.0 version
        Student student = new Student(1, "Angga", true);
        String jsonString = gson.toJson(student);
        System.out.println(jsonString);

        // all value will returned version
        gson = new Gson();
        jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}
