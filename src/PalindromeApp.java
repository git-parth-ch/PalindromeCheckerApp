import java.util.LinkedList;

public class PalindromeApp {

    public static void main(String[] args) {

        // Step 1: Define the input string
        String text = "level";

        // Step 2: Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Step 3: Add each character to the linked list
        for (char ch : text.toCharArray()) {
            list.add(ch);
        }

        // Step 4: Flag to track palindrome state
        boolean isPalindrome = true;

        // Step 5: Compare first and last until 0 or 1 element remains
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input: " + text);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}