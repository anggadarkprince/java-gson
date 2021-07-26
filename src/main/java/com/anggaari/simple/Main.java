package com.anggaari.simple;

import com.anggaari.simple.user.UserAddress;
import com.anggaari.simple.user.UserSimple;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        UserAddress userAddress = new UserAddress(
                "Main Street",
                "42A",
                "Magdeburg",
                "Germany"
        );

        UserSimple userObject = new UserSimple(
                "Norman",
                "norman@futurestud.io",
                26,
                true,
                userAddress
        );
        Gson gson = new Gson();
        String userJson = gson.toJson(userObject);
        System.out.println(userJson);

        UserSimple userObject2 = gson.fromJson(userJson, UserSimple.class);
        System.out.println(userObject2.name);
        System.out.println(userObject2.email);
        System.out.println(userObject2.userAddress.street);
    }
}
