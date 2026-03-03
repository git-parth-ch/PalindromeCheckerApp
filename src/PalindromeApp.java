public class PalindromeApp {

    public static void main(String[] args) {

        // Hardcoded input
        String text = "radar";

        // Convert string to character array
        char[] characters = text.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Output
        System.out.println("Input : " + text);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}