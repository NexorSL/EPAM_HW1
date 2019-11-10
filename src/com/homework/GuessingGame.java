package com.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private static final String RULES = "The player must to guess numbers until the player guesses the correct number.";
    private static final String ENTER_NUMBER = "Enter number:";
    private static final String YOU_GUESSED_IT = "You guessed it";
    private static final String TOO_LOW = "Too low";
    private static final String TOO_HIGH = "Too high";
    private static final String ERROR = "\nError.";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean isCorrect = false;
        int number;
        int randomNumber = 1 + random.nextInt(1000);
        System.out.println(RULES);
        do {
            System.out.println(ENTER_NUMBER);
            try {
                number = in.nextInt();
            } catch (Exception e) {
                System.out.println(e + ERROR);
                break;
            }
            if (number == randomNumber) {
                System.out.println(YOU_GUESSED_IT);
                isCorrect = true;
            } else if (number < randomNumber) {
                System.out.println(TOO_LOW);
            } else if (number > randomNumber) {
                System.out.println(TOO_HIGH);
            }
        } while (!isCorrect);
    }
}
