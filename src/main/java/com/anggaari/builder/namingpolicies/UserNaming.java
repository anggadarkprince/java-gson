package com.anggaari.builder.namingpolicies;

import com.google.gson.annotations.SerializedName;

public class UserNaming {
    public String Name;
    @SerializedName("emailOfDeveloper") // will leave field untouched
    public String email_of_developer;
    public boolean isDeveloper;
    public int _ageOfDeveloper;

    public UserNaming(String name, String email_of_developer, boolean isDeveloper, int _ageOfDeveloper) {
        Name = name;
        this.email_of_developer = email_of_developer;
        this.isDeveloper = isDeveloper;
        this._ageOfDeveloper = _ageOfDeveloper;
    }
}
