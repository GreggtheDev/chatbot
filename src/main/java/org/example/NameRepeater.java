package org.example;

import java.util.Scanner;

public class NameRepeater {
    // Method to ask the user to enter and repeat their name
    public static String askUserToRepeatName(Scanner scanner) {
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();  // Read the user's name
        System.out.println("Nice to meet you, " + name + "! Can you please repeat your name?");
        return name;  // Return the user's name
    }
}

