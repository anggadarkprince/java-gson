package com.anggaari.builder.modelversioning;

import com.google.gson.annotations.Since;

public class Student {
    @Since(1.0)
    public int studentNumber;

    @Since(1.0)
    public String name;

    @Since(1.1)
    public boolean isVerified;

    public Student(int studentNumber, String name, boolean isVerified) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.isVerified = isVerified;
    }
}
