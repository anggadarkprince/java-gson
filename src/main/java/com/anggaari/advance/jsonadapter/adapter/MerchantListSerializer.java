package com.anggaari.advance.jsonadapter.adapter;

import com.anggaari.advance.jsonadapter.models.Merchant;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.List;

public class MerchantListSerializer implements JsonSerializer<List<Merchant>> {
    @Override
    public JsonElement serialize(List<Merchant> src, Type typeOfSrc, JsonSerializationContext context) {
        JsonArray jsonMerchant = new JsonArray();

        for (Merchant merchant : src) {
            jsonMerchant.add("" + merchant.id);
        }

        return jsonMerchant;
    }
}
