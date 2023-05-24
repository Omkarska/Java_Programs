import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Case Insensitive Palindrome Check");
        System.out.println("2. Case Sensitive Palindrome Check");
        int choice = scanner.nextInt();
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        if (choice == 1) {
            inputString = inputString.toLowerCase();
        } else if (choice == 2) {
            inputString = inputString;
        } else {
            System.out.println("Invalid Choice");
        }
        boolean isPalindrome = checkPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
