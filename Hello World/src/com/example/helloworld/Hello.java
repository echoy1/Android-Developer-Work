package com.example.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String answer;
        System.out.println("Welcome!");
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        do {
            System.out.println("If you would like to start, say yes.");
            answer = scanner.next();
        } while (!answer.equals("yes"));

        Random random = new Random();
        int number = random.nextInt(100 + 1);

        System.out.println("Please guess the number I'm thinking of between 1 and 100");
        int guesses = 0;
        while (guesses < 5) {
            int guess = scanner.nextInt();
            if ()
            if (guess == number) {
                System.out.println("Congratulations!!");
                break;
            } else {
                if (guess > number) {
                    System.out.println("Guess lower!");
                } else {
                    System.out.println("Guess higher!");
                }
                guesses++;
            }
            if (guesses == 5) {
                System.out.println("Game Over");
                System.out.println("The number was " + number);
                break;
            }
        }
    }
}
