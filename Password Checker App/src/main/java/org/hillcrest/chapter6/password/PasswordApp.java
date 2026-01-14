package org.hillcrest.chapter6.password;

import java.util.Scanner;

/**
 * Main application class for the Password Strength Checker.
 * Prompts the user for a password and displays strength and feedback.
 * The setting up for how you can enter the passcode
 */
public class PasswordApp {
    //main method goes here
    //prompt user for passwords
    //Check for strength
    //Provide user feedback based on the strength of the password
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        int score = CriteriaChecker.evaluateCriteria(password);
        String strength = CriteriaChecker.determineStrength(score);

        System.out.println("\nPassword Strength: " + strength + " (" + score + "/5)");
        if(!strength.equals("Strong")) {
            System.out.println("Suggestions to improve your password:");
            System.out.println(FeedbackGenerator.generateFeedback(password));
        }

    }
}