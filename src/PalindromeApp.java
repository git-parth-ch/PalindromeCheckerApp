import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeApp {

    public static void main(String[] args) {

        // Hardcoded input
        String text = "madam";

        char[] characters = text.toCharArray();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char ch : characters) {
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input: " + text);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}