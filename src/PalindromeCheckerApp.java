import java.util.Stack;
public class PalindromeCheckerApp {


        // Main Method - Entry point of the program
        public static void main(String[] args) {

            // Hardcoded string
            String input = "madam";

            // Create Stack
            Stack<Character> stack = new Stack<>();

            // Push characters into stack
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }

            // Pop characters and build reversed string
            String reversed = "";

            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();
            }

            // Compare original and reversed string
            if (input.equals(reversed)) {
                System.out.println("The string \"" + input + "\" is a Palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
            }
        }
    }
