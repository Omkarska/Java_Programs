import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read 10 strings from the console
        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort the strings
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();
        String combinedString = firstString.concat(secondString);
        System.out.println("Combined string: " + combinedString);

        // Reverse the first string and display it
        String reversedString = reverseString(firstString);
        System.out.println("Reversed first string: " + reversedString);

        scanner.close();
    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
