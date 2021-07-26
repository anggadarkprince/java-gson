package com.anggaari.builder.namingpolicies;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        // previously
        Gson gson = new Gson();

        // now using GsonBuilder
        GsonBuilder gsonBuilder = new GsonBuilder();
        // The field naming policy IDENTITY uses the exact same naming as the Java model when it serializes an object.
        // No matter with what naming standard you set up your Java models, the JSON will use the same ones.
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.IDENTITY);
        Gson gsonInstance = gsonBuilder.create();

        UserNaming user = new UserNaming("Norman", "norman@futurestud.io", true, 26);
        System.out.println(gsonInstance.toJson(user));

        // The LOWER_CASE_WITH_UNDERSCORES will split up the property names based on upper characters and replace
        // those upper characters with a lower one leading with a _
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        System.out.println(gsonBuilder.create().toJson(user));

        // The third option we would like to show you is LOWER_CASE_WITH_DASHES.It uses the same system as the previous
        // LOWER_CASE_WITH_UNDERSCORES, but replaces the field name separation with -
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_DASHES);
        System.out.println(gsonBuilder.create().toJson(user));

        // The fourth policy is UPPER_CAMEL_CASE, which makes the first letter upper case
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        System.out.println(gsonBuilder.create().toJson(user));

        // The last policy UPPER_CAMEL_CASE_WITH_SPACES is almost identical to UPPER_CAMEL_CASE
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES);
        System.out.println(gsonBuilder.create().toJson(user));


        // Customer naming strategy
        FieldNamingStrategy customPolicy = new FieldNamingStrategy() {
            @Override
            public String translateName(Field f) {
                return f.getName().replace("_", "");
            }
        };
        gsonBuilder.setFieldNamingStrategy(customPolicy);
        System.out.println(gsonBuilder.create().toJson(user));



        // Deserialization
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        PostReviewer postReviewer = gsonBuilder.create().fromJson("{'reviewer_name': 'Marcus'}", PostReviewer.class);
        System.out.println(postReviewer.reviewerName);
    }
}
