package com.anggaari.nullvalue;

import com.anggaari.simple.user.UserSimple;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        UserSimple userObject = new UserSimple(null, "norman@futurestud.io", 26, true);

        Gson gson = new Gson();

        // serialization
        String userJson = gson.toJson(userObject); // userJson = ??
        System.out.println(userJson); // email will be excluded

        // deserialization
        String userString = "{'email': 'norman@futurestud.io', 'name': 'Norman'}";
        UserSimple user2 = gson.fromJson(userString, UserSimple.class);
        System.out.println(user2.name);
        System.out.println(user2.email);
        System.out.println(user2.age); // default to 0
        System.out.println(user2.isDeveloper); // default to false
    }
}
