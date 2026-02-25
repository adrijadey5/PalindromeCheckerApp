public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcome();
        checkHardcodedPalindrome();
    }

    public static void displayWelcome() {
        System.out.println("Welcome to Palindrome Checker");
    }

    public static void checkHardcodedPalindrome() {
        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}