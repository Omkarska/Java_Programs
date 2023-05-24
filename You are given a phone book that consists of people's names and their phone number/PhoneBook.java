import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of entries in the phone book.
        int numberOfEntries = Integer.parseInt(scanner.nextLine());

        // Create a HashMap to store the phone book entries.
        HashMap<String, String> phoneBook = new HashMap<>();

        // Add the entries to the HashMap.
        for (int i = 0; i < numberOfEntries; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Get the queries.
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();

            // Check if the query is in the phone book.
            if (phoneBook.containsKey(query)) {
                System.out.println(query + " " + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
