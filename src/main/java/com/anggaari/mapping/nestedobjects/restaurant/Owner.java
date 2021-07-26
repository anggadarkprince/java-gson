package com.anggaari.mapping.nestedobjects.restaurant;

import com.anggaari.mapping.simple.user.UserAddress;

public class Owner {
    public String name;
    public UserAddress address;

    public Owner(String name, UserAddress address) {
        this.name = name;
        this.address = address;
    }
}
