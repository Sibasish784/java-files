package logics.numberPalind;
import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        int original = number; // Store the original number
        int palind = 0; // This will hold the reversed number

        while (number > 0) {
            int rem = number % 10; // Get the last digit
            palind = (palind * 10) + rem; // Build the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        // Check if the original number is equal to the reversed number
        return original == palind;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }
}
