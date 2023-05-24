import java.util.Scanner;

public class CheckStringForE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        checkStringForE(inputString);
    }

    public static void checkStringForE(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'e') {
                System.out.println("The string contains 'e' at index " + i + ".");
                return;
            }
        }
        System.out.println("The string does not contain 'e'.");
    }
}
