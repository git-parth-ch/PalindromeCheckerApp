import java.util.Scanner;

public class PalindromeApp {

    // Encapsulated PalindromeChecker class
    static class PalindromeChecker {

        public boolean checkPalindrome(String input) {

            if (input == null) {
                return false;
            }

            input = input.toLowerCase();

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
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input:" + input);
        System.out.println("Is Palindrome : " + result);

        scanner.close();
    }
}