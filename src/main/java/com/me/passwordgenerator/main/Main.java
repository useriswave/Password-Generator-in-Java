package com.me.passwordgenerator.main;

import com.me.passwordgenerator.model.PasswordGenerator;
import com.me.passwordgenerator.prompt.Prompt;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator gen = new PasswordGenerator();

        while(true) {
            int length = Prompt.askInt("Enter a password length (or input <= 0 to exit):");

            if(length <= 0) {
                break;
            }
            else {
                String password = gen.generatePassword(length);
                System.out.println("Password: " + password);
            }
        }

        System.out.println("Program stopped.");
    }
}
