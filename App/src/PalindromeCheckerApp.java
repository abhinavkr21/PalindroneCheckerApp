/*
 * UseCase1: Application Entry & Welcome Message
 * Palindrome Checker App
 */

public class PalindromeCheckerApp {

    // Application Constants
    static final String APP_NAME = "Palindrome Checker App";
    static final String VERSION = "Version 1.0";

    // Main Method - Entry Point of JVM
    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println("      Welcome to " + APP_NAME);
        System.out.println("=====================================");

        // Display Version
        System.out.println("Application: " + APP_NAME);
        System.out.println("Application " + VERSION);

        System.out.println("\nSystem Ready for Palindrome Validation...");
        System.out.println("=====================================");
    }
}