import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        try {
            // Specify the path of the text file
            String filePath = "C://Users//Admin//Desktop//Java_Programs//Write Java Program to find the number of the words in the given text file//Myfile.txt";

            // Create a File object
            File file = new File(filePath);

            // Create a Scanner to read the file
            Scanner scanner = new Scanner(file);

            int wordCount = 0;

            while (scanner.hasNext()) {
                // Read each word in the file
                String word = scanner.next();
                // Increment the word count
                wordCount++;
            }

            System.out.println("Number of words in the file: " + wordCount);

            // Close the scanner
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
