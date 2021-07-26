package com.anggaari.builder.exclusionstrategies;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setExclusionStrategies(new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes f) {
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> incomingClass) {
                return incomingClass == Date.class || incomingClass == boolean.class;
            }
        });
        Gson gson = gsonBuilder.create();

        // exclude variable with class date or boolean
        UserDate user = new UserDate("Norman", "norman@futurestud.io", 26, true);
        String usersJson = gson.toJson(user);
        System.out.println(usersJson);


        // exclude variable with modifier static or final
        gsonBuilder.excludeFieldsWithModifiers(Modifier.STATIC, Modifier.FINAL);
        UserModifier user2 = new UserModifier("Norman", "norman@fs.io", true);
        String usersJson2 = gsonBuilder.create().toJson(user2);
        System.out.println(usersJson2);
    }
}
