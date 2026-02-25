public class PalindromeCheckerApp {

        // Main Method - Entry point of the application
        public static void main(String[] args) {

            // Hardcoded string
            String input = "radar";

            // Convert string to character array
            char[] characters = input.toCharArray();

            // Two-pointer approach
            int start = 0;
            int end = characters.length - 1;

            boolean isPalindrome = true;

            while (start < end) {
                if (characters[start] != characters[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Display result
            if (isPalindrome) {
                System.out.println("The string \"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
            }
        }
    }
