import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove spaces
        input = input.toLowerCase().replaceAll("\\s+", "");          

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {

            char qChar = queue.remove(); // Dequeue
            char sChar = stack.pop();    // Pop

            if (qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}