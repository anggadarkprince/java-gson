package com.anggaari.builder.prettyprint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.setLenient();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        String[] lang = {"Java", "Node", "Kotlin", "JavaScript"};
        String json = gson.toJson(lang);

        System.out.println(json);
    }
}
