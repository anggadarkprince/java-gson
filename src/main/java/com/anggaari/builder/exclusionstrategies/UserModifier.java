package com.anggaari.builder.exclusionstrategies;

public class UserModifier {
    private String name;
    private transient String email;
    private static boolean isDeveloper;
    private final int age;

    public UserModifier(String name, String email, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        UserModifier.isDeveloper = isDeveloper;
        this.age = 0;
    }
}
