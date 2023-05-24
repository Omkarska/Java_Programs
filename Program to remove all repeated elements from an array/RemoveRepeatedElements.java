import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveRepeatedElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] resultArray = removeRepeatedElements(array);
        System.out.println("Array with repeated elements removed:");

        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }

    public static int[] removeRepeatedElements(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int element : array) {
            if (uniqueElements.add(element)) {
                result.add(element);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}

// import java.util.Scanner;

// public class RemoveRepeatedElements {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the size of the array: ");
// int size = scanner.nextInt();

// int[] array = new int[size];
// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < size; i++) {
// array[i] = scanner.nextInt();
// }

// int[] resultArray = removeRepeatedElements(array);
// System.out.println("Array with repeated elements removed:");

// for (int element : resultArray) {
// System.out.print(element + " ");
// }
// }

// public static int[] removeRepeatedElements(int[] array) {
// int uniqueCount = 0;

// // Count the number of unique elements
// for (int i = 0; i < array.length; i++) {
// boolean isUnique = true;
// for (int j = 0; j < i; j++) {
// if (array[i] == array[j]) {
// isUnique = false;
// break;
// }
// }
// if (isUnique) {
// uniqueCount++;
// }
// }

// // Create a new array with unique elements
// int[] resultArray = new int[uniqueCount];
// int currentIndex = 0;
// for (int i = 0; i < array.length; i++) {
// boolean isUnique = true;
// for (int j = 0; j < i; j++) {
// if (array[i] == array[j]) {
// isUnique = false;
// break;
// }
// }
// if (isUnique) {
// resultArray[currentIndex] = array[i];
// currentIndex++;
// }
// }

// return resultArray;
// }
// }
