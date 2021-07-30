package com.anggaari.advance.jsonadapter;

import com.anggaari.advance.jsonadapter.models.Merchant;
import com.anggaari.advance.jsonadapter.models.UserSubscription;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.List;

public class Serialization {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson customGson = gsonBuilder.create();

        Merchant merchant1 = new Merchant(1, "Barbershop", "Vaernue 34");
        Merchant merchant2 = new Merchant(2, "Babyshop", "Openstreet 10");
        List<Merchant> subscribedMerchants = Arrays.asList(merchant1, merchant2);
        UserSubscription subscription = new UserSubscription(
                "Angga",
                "angga@mail.com",
                26,
                subscribedMerchants);
        String customJSON = customGson.toJson(subscription);
        System.out.println(customJSON);
    }
}
