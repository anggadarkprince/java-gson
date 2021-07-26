package com.anggaari.builder.forcenull;

import com.anggaari.mapping.simple.user.UserSimple;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeNulls();
        Gson gson = gsonBuilder.create();

        UserSimple user = new UserSimple("Norman", null, 26, true);
        String usersJson = gson.toJson(user);
        System.out.println(usersJson);
    }
}
