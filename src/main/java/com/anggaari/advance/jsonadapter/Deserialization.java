package com.anggaari.advance.jsonadapter;

import com.anggaari.advance.jsonadapter.models.UserDate;
import com.google.gson.Gson;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Deserialization {
    public static void main(String[] args) {
        String userJson = "{" +
                "    'year': 2021," +
                "    'month': 5," +
                "    'day': 21," +
                "    'age': 26," +
                "    'email': 'angga@mail.com'," +
                "    'isDeveloper': true," +
                "    'name': 'Angga Ari Wijaya'" +
                "}";
        UserDate customObject = new Gson().fromJson(userJson, UserDate.class);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(customObject.registerDate);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
    }
}
