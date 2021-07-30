package com.anggaari.advance.custominstancecreator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(
                UserContext.class,
                new UserContextInstanceCreator(getApplicationContext())
        );
        Gson customGson = gsonBuilder.create();

        String userSimpleJson = "{'age': 26, 'email': 'norman@fs.io', 'isDeveloper': true, 'name': 'Norman'}";
        UserContext customObject = customGson.fromJson(userSimpleJson, UserContext.class);
        System.out.println(customObject.context);
    }

    public static String getApplicationContext() {
        return "this is a context";
    }
}
