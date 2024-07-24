package org.example;

import java.util.Scanner;

public class AgeGuesser {
    // Method to guess the user's age
    public static int guessUserAge(Scanner scanner) {
        System.out.println("Let's play a game. I'll guess your age.");
        System.out.println("Please enter a number between 1 and 100:");

        int lowerBound = 1;  // Lower bound for guessing
        int upperBound = 100;  // Upper bound for guessing
        int ageGuess;

        // Loop until the age is guessed correctly
        while (true) {
            ageGuess = (lowerBound + upperBound) / 2;  // Calculate the middle value
            System.out.println("Is your age " + ageGuess + "? (Enter 'higher', 'lower', or 'correct')");
            String response = scanner.nextLine().toLowerCase();  // Read the user's response

            if (response.equals("higher")) {
                lowerBound = ageGuess + 1;  // Increase the lower bound
            } else if (response.equals("lower")) {
                upperBound = ageGuess - 1;  // Decrease the upper bound
            } else if (response.equals("correct")) {
                System.out.println("Yay! I guessed your age correctly.");
                return ageGuess;  // Return the guessed age
            } else {
                System.out.println("Please enter 'higher', 'lower', or 'correct'.");
            }
        }
    }
}

