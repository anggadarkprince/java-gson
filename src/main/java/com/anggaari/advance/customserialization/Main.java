package com.anggaari.advance.customserialization;

import com.anggaari.advance.customserialization.models.Merchant;
import com.anggaari.advance.customserialization.models.UserSubscription;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        JsonSerializer<Merchant> serializer = (src, typeOfSrc, context) -> {
            JsonObject jsonMerchant = new JsonObject();
            jsonMerchant.addProperty("id", src.id);
            return jsonMerchant;
        };

        JsonSerializer<List<Merchant>> serializerAsStringObj = (src, typeOfSrc, context) -> {
            JsonObject jsonMerchant = new JsonObject();
            List<String> merchantIds = new ArrayList<>(src.size());
            for (Merchant merchant : src) {
                merchantIds.add("" + merchant.id);
            }

            String merchantIdsAsString = String.join(",", merchantIds);
            jsonMerchant.addProperty("ids", merchantIdsAsString);

            return jsonMerchant;
        };

        JsonSerializer<List<Merchant>> serializerAsArray = (src, typeOfSrc, context) -> {
            JsonArray jsonMerchant = new JsonArray();

            for (Merchant merchant : src) {
                jsonMerchant.add("" + merchant.id);
            }

            return jsonMerchant;
        };

        // will be ignored because bellow replaced with another type adapter
        gsonBuilder.registerTypeAdapter(Merchant.class, serializer);

        Type merchantListType = new TypeToken<List<Merchant>>() {}.getType();
        gsonBuilder.registerTypeAdapter(merchantListType, serializerAsArray);

        Gson gson = gsonBuilder.create();

        Merchant merchant1 = new Merchant(1, "Barbershop", "Vaernue 34");
        Merchant merchant2 = new Merchant(2, "Babyshop", "Openstreet 10");
        List<Merchant> subscribedMerchants = Arrays.asList(merchant1, merchant2);
        UserSubscription userSubscription = new UserSubscription("Angga", "angga@mail.com", 23, subscribedMerchants);
        String subscriptionJson = gson.toJson(userSubscription);
        System.out.println(subscriptionJson);
    }
}
