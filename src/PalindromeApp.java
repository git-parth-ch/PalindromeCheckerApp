public class PalindromeApp {

    public static void main(String[] args) {

        // Hardcoded string
        String text = "madam";

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < text.length() / 2; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
                break;  // stop checking once mismatch is found
            }
        }

        // Required Output Format
        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome: " + isPalindrome);
    }
}