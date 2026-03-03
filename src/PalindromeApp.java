public class PalindromeApp {

    public static void main(String[] args) {

        // Step 1: Define the input string
        String text = "madam";

        // Step 2: Call recursive palindrome check
        boolean isPalindrome = isPalindromeRecursive(text, 0, text.length() - 1);

        // Output
        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }

    // Recursive method
    static boolean isPalindromeRecursive(String text, int start, int end) {

        // Base condition: single character or crossed indices
        if (start >= end) {
            return true;
        }

        // Check mismatch
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
}