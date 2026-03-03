import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeApp {

    public static void main(String[] args) {

        // Hardcoded input
        String text = "refer";

        char[] characters = text.toCharArray();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert all characters into deque
        for (char ch : characters) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input: " + text);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}