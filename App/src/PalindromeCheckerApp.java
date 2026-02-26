/**
 * ==========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates Encapsulation by separating
 * palindrome logic into a dedicated service class.
 *
 * Concepts Used:
 * - Encapsulation
 * - Single Responsibility Principle
 * - Clean OOP Design
 *
 * @author Abhinav Kumar
 * @version 11.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


/**
 * PalindromeChecker Service Class
 * Encapsulates palindrome validation logic.
 */
class PalindromeChecker {

    /**
     * Checks whether the given string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, otherwise false
     */
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}