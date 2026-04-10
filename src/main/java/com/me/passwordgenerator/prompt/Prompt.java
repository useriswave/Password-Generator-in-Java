package com.me.passwordgenerator.prompt;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prompt {

    private static final Scanner SC = new Scanner(System.in);

    private Prompt() {}

    public static int askInt(String question) {
        while(true) {
            try {
                System.out.print(question + " ");
                return SC.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid entry.");
                SC.nextLine();
            }
        }
    }

    public static void closeScanner() {
        SC.close();
    }
}
