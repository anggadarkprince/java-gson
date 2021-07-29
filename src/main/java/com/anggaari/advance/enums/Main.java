package com.anggaari.advance.enums;

import com.anggaari.advance.enums.models.Day;
import com.anggaari.advance.enums.models.UserDayEnum;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();

        UserDayEnum userObject = new UserDayEnum("Angga", "angga@mail.com", true, 26, Day.SUNDAY);
        String userWithEnumJson = gson.toJson(userObject);
        System.out.println(userWithEnumJson);

        String userJson = "{'email': 'norman@futurestud.io', 'age': 26, 'day': 'FRIDAY'}";
        UserDayEnum user = gson.fromJson(userJson, UserDayEnum.class);
        System.out.println(user.day);
    }
}
