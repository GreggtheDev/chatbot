package org.example;

import java.util.Scanner;

public class WeekdayPhrase {
    // Method to output a phrase about each day of the week
    public static void outputWeekdayPhrase(Scanner scanner) {
        System.out.println("Enter a number from 1 to 7 to know what I enjoy about each day of the week:");
        int day = scanner.nextInt();  // Read the user's input
        scanner.nextLine(); // Consume the newline character

        // Use a switch statement to output a phrase based on the day of the week
        switch (day) {
            case 1:
                System.out.println("I'm a little buggy on Mondays.");
                break;
            case 2:
                System.out.println("Tuesdays are for tackling new challenges!");
                break;
            case 3:
                System.out.println("Wednesdays are wonderful for writing code.");
                break;
            case 4:
                System.out.println("Thursdays are thrilling with all the possibilities.");
                break;
            case 5:
                System.out.println("Fridays are fantastic for finishing projects.");
                break;
            case 6:
                System.out.println("Saturdays are superb for some relaxation.");
                break;
            case 7:
                System.out.println("Sundays are serene and perfect for planning.");
                break;
            default:
                System.out.println("That's not a valid day of the week.");
                break;
        }
    }
}

