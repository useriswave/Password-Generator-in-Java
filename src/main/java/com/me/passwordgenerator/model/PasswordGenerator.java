package com.me.passwordgenerator.model;

import java.util.Random;

public class PasswordGenerator {

    private final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String lower = upper.toLowerCase();
    private final String numbers = "1234567890";
    private final String specialChars = "!@#$%^&*()_+";
    private final String combination = upper + lower + numbers + specialChars;

    private final Random R;

    public PasswordGenerator() {
        this.R = new Random();
    }

    public String generatePassword(int length) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            sb.append(combination.charAt(R.nextInt(combination.length() -1)));
        }
        return sb.toString();
    }
}
