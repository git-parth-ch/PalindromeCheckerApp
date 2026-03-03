import java.util.Scanner;
import java.util.Stack;

public class PalindromeApp {

    // Algorithm 1: Two Pointer Approach
    public static boolean checkUsingTwoPointer(String input) {

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

    // Algorithm 2: Stack Approach
    public static boolean checkUsingStack(String input) {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Measure Two Pointer time
        long startTime1 = System.nanoTime();
        boolean result1 = checkUsingTwoPointer(input);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        // Measure Stack time
        long startTime2 = System.nanoTime();
        boolean result2 = checkUsingStack(input);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        System.out.println("Input: " + input);
        System.out.println("Two Pointer Result : " + result1);
        System.out.println("Two Pointer Time (ns) : " + duration1);

        System.out.println("Stack Result : " + result2);
        System.out.println("Stack Time (ns) : " + duration2);

        scanner.close();
    }
}