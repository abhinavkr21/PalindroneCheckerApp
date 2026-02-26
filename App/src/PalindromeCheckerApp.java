/**
 * ==========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Goal:
 * Check whether a string is a palindrome by reversing it.
 *
 * Flow:
 * - Reverse string using loop
 * - Compare original and reversed string
 * - Display result
 *
 * Key Concepts:
 * - for loop
 * - String immutability
 * - String concatenation (+)
 * - equals() method
 *
 * Data Structure: String
 *
 * @author Abhinav Kumar
 * @version 3.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
        }
    }
}