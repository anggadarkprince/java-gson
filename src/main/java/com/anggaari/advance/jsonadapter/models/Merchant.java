package com.anggaari.advance.jsonadapter.models;

import com.google.gson.annotations.Expose;

public class Merchant {
    public int id;

    @Expose(serialize = false)
    public String name;

    @Expose(serialize = false)
    public String address;

    public Merchant(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
