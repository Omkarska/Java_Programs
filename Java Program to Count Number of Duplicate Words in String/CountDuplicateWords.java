import java.util.Scanner;

public class CountDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int count = countDuplicateWords(inputString);

        System.out.println("Number of duplicate words: " + count);
    }

    public static int countDuplicateWords(String inputString) {
        // Remove leading and trailing spaces
        inputString = inputString.trim();

        // Split the input string into words
        String[] words = inputString.split("\\s+");

        int count = 0;

        // Compare each word with other words
        for (int i = 0; i < words.length; i++) {
            // Skip empty words
            if (words[i].isEmpty()) {
                continue;
            }

            // Compare the current word with subsequent words
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count++;
                    // Mark the duplicate word as empty
                    words[j] = "";
                }
            }
        }

        return count;
    }
}
