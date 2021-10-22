package com.codecool.codewars;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(3) + 1;
        System.out.println("Try to guess what number I'm thinking...");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int guess = Integer.parseInt(input);

        System.out.println("I was thinking: " + secret + " Your guess was: " + guess);
        if (secret == guess) {
            System.out.println("WIN");
        } else {
            System.out.println("LOSE");
        }
    }
}
