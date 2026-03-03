public class PalindromeApp {

    public static void main(String[] args) {

// Hardcoded string
        String text = "madam";

// Reverse the string
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

// Check if palindrome
        boolean isPalindrome = text.equals(reversed);

        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}