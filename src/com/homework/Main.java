package com.homework;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean boo = true;
        int number;
        int randomNumber = 1 + random.nextInt(1000);
        System.out.println("The player must to guess numbers until the player guesses the correct number.");
        do {
            System.out.println("Enter number:");
            try {
                number = in.nextInt();
            } catch (Exception e) {
                System.out.println(e + "\nError.");
                break;
            }
            if (number == randomNumber) {
                System.out.println("You guessed it");
                boo = false;
            } else if (number < randomNumber) {
                System.out.println("Too low");
            } else if (number > randomNumber) {
                System.out.println("Too high");
            }
        } while (boo);
    }
}
