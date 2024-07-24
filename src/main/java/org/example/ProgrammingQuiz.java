package org.example;

import java.util.Scanner;

public class ProgrammingQuiz {
    // Method to test the user's programming knowledge
    public static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the output of the following code?");
        System.out.println("int x = 5;\nint y = 10;\nSystem.out.println(x + y);");

        // Multiple-choice options
        String[] options = {"a) 10", "b) 15", "c) 20", "d) 25"};

        // Display the options
        for (String option : options) {
            System.out.println(option);
        }

        String correctAnswer = "b";  // Correct answer

        // Loop until the correct answer is given
        while (true) {
            System.out.println("Enter your choice (a, b, c, or d):");
            String answer = scanner.nextLine().toLowerCase();  // Read the user's answer

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct! Well done.");
                break;  // Exit the loop if the answer is correct
            } else {
                System.out.println("Incorrect. Please try again.");
            }
        }
    }
}

