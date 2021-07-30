package com.anggaari.advance.customdeserialization;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();

        JsonDeserializer<UserDate> deserializer = (json, typeOfT, context) -> {
            JsonObject jsonObject = json.getAsJsonObject();

            Calendar cal = Calendar.getInstance();
            cal.set(
                    jsonObject.get("year").getAsInt(),
                    jsonObject.get("month").getAsInt(),
                    jsonObject.get("day").getAsInt()
            );
            Date date = cal.getTime();

            return new UserDate(
                    jsonObject.get("name").getAsString(),
                    jsonObject.get("email").getAsString(),
                    jsonObject.get("isDeveloper").getAsBoolean(),
                    jsonObject.get("age").getAsInt(),
                    date
            );
        };
        gsonBuilder.registerTypeAdapter(UserDate.class, deserializer);

        Gson customGson = gsonBuilder.create();
        String userJson = "{" +
                "    'year': 2021," +
                "    'month': 5," +
                "    'day': 21," +
                "    'age': 26," +
                "    'email': 'angga@mail.com'," +
                "    'isDeveloper': true," +
                "    'name': 'Angga Ari Wijaya'" +
                "}";
        UserDate customObject = customGson.fromJson(userJson, UserDate.class);
        System.out.println(customObject.registerDate.toString());
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(customObject.registerDate);

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
    }
}
