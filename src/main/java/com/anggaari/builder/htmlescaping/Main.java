package com.anggaari.builder.htmlescaping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        GsonBuilder builder = new GsonBuilder();
        builder.disableHtmlEscaping(); // disable escaping html
        builder.setLenient();
        builder.serializeNulls();
        builder.serializeSpecialFloatingPointValues();
        builder.enableComplexMapKeySerialization();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        String content = "<font color='#FB4E44'>";
        Tag tag = new Tag("colorcontent", content);

        // serialization
        String result = gson.toJson(tag);
        System.out.println(result);

        // deserialization results
        tag = gson.fromJson(result, tag.getClass());
        System.out.println(tag.type + " " + tag.content);
    }
}
