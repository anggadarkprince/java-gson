package com.anggaari.advance.jsonadapter.adapter;

import com.anggaari.advance.jsonadapter.models.UserDate;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;

public class UserDateDeserializer implements JsonDeserializer<UserDate> {
    @Override
    public UserDate deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
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
    }
}
