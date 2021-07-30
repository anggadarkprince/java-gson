package com.anggaari.advance.jsonadapter.models;

import com.anggaari.advance.jsonadapter.adapter.MerchantListSerializer;
import com.google.gson.annotations.JsonAdapter;

import java.util.List;

public class UserSubscription {
    public String name;
    public String email;
    public int age;

    @JsonAdapter(MerchantListSerializer.class)
    List<Merchant> merchantList;

    public UserSubscription(String name, String email, int age, List<Merchant> merchantList) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.merchantList = merchantList;
    }
}
