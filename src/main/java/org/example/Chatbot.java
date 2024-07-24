package org.example;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Call each method from different classes to perform chatbot tasks
        Greeting.greetUser();
        String name = NameRepeater.askUserToRepeatName(scanner);
        int age = AgeGuesser.guessUserAge(scanner);
        NumberCounter.countToNumber(scanner);
        ProgrammingQuiz.testProgrammingKnowledge(scanner);
        StoryTeller.tellUserStory(name, age);
        WeekdayPhrase.outputWeekdayPhrase(scanner);

        // Close the Scanner object
        scanner.close();
    }
}
