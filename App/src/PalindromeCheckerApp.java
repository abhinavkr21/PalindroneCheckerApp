import java.util.*;

/**
 * ==========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Demonstrates dynamic selection of palindrome algorithm
 * using Strategy Design Pattern.
 *
 * @author Abhinav Kumar
 * @version 12.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeService service = new PalindromeService(strategy);

        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Using Strategy : " + strategy.getClass().getSimpleName());
        System.out.println("Is Palindrome? : " + result);
    }
}


/* ================= STRATEGY INTERFACE ================= */

interface PalindromeStrategy {
    boolean check(String input);
}


/* ================= STACK STRATEGY ================= */

class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


/* ================= DEQUE STRATEGY ================= */

class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}


/* ================= CONTEXT CLASS ================= */

class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}