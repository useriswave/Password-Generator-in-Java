package com.me.passwordgenerator.prompt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prompt {

    private static Scanner sc = new Scanner(System.in);

    private Prompt() {}

    public static int askInt(String question) {
        while(true) {
            try {
                System.out.print(question + " ");
                return sc.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid entry.");
                sc.nextLine();
            }
        }
    }
}
