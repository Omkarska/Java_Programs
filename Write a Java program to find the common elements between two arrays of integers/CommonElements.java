import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements between the two arrays:");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> commonElementsList = new ArrayList<>();

        // Add elements of the first array to the set
        for (int element : array1) {
            set.add(element);
        }

        // Check elements of the second array against the set
        for (int element : array2) {
            if (set.contains(element)) {
                commonElementsList.add(element);
            }
        }

        // Convert the list to an array
        int[] commonElementsArray = new int[commonElementsList.size()];
        for (int i = 0; i < commonElementsList.size(); i++) {
            commonElementsArray[i] = commonElementsList.get(i);
        }

        return commonElementsArray;
    }
}
