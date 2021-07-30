package com.anggaari.advance.custominstancecreator;

import com.google.gson.InstanceCreator;

import java.lang.reflect.Type;

public class UserContextInstanceCreator implements InstanceCreator<UserContext> {
    private String context;

    public UserContextInstanceCreator(String context) {
        this.context = context;
    }

    @Override
    public UserContext createInstance(Type type) {
        // create new object with our additional property
        UserContext userContext = new UserContext(context);

        // return it to gson for further usage
        return userContext;
    }
}
