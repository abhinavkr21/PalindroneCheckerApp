import java.util.*;

/**
 * ==========================================================
 * MAIN CLASS - UseCase13PerformanceComparisonApp
 * ==========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * Compares execution time of multiple palindrome algorithms.
 *
 * Algorithms Compared:
 * - Two Pointer Approach
 * - Stack Based Approach
 * - Deque Based Approach
 *
 * Uses System.nanoTime() to measure performance.
 *
 * @author Abhinav Kumar
 * @version 13.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "AmanaplanacanalPanamaAmanaplanacanalPanama";

        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("Input Length : " + input.length());
        System.out.println("--------------------------------------------------");

        // Two Pointer
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Execution Time     : " + (end1 - start1) + " ns");
        System.out.println();

        System.out.println("Stack Result       : " + result2);
        System.out.println("Execution Time     : " + (end2 - start2) + " ns");
        System.out.println();

        System.out.println("Deque Result       : " + result3);
        System.out.println("Execution Time     : " + (end3 - start3) + " ns");
    }

    // ================= TWO POINTER =================
    private static boolean twoPointerCheck(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // ================= STACK =================
    private static boolean stackCheck(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        for (char c : s.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // ================= DEQUE =================
    private static boolean dequeCheck(String s) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
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