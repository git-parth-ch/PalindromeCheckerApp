import java.util.Scanner;
import java.util.Stack;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack Strategy Implementation
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        if (input == null) {
            return false;
        }

        input = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    // Strategy injected via constructor
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

// Main Class
public class PalindromeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Inject StackStrategy (Strategy Pattern)
        PalindromeStrategy strategy = new StackStrategy();
        PalindromeChecker checker = new PalindromeChecker(strategy);

        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input:" + input);
        System.out.println("Is Palindrome : " + result);

        scanner.close();
    }
}