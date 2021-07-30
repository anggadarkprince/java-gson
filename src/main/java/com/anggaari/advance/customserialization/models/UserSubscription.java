package com.anggaari.advance.customserialization.models;

import java.util.List;

public class UserSubscription {
    public String name;
    public String email;
    public int age;
    List<Merchant> merchantList;

    public UserSubscription(String name, String email, int age, List<Merchant> merchantList) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.merchantList = merchantList;
    }
}
