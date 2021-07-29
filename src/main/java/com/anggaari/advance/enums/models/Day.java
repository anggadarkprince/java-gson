package com.anggaari.advance.enums.models;

import com.google.gson.annotations.SerializedName;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    @SerializedName("LazyDay1") SATURDAY,
    @SerializedName("LazyDay1") SUNDAY,
}