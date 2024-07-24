package org.example;

import java.util.Scanner;

public class NumberCounter {
    // Method to count to a number specified by the user
    public static void countToNumber(Scanner scanner) {
        System.out.println("Tell me a number, and I will count to it:");
        int number = scanner.nextInt();  // Read the number
        scanner.nextLine(); // Consume the newline character

        // Loop to count from 1 to the specified number
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}

