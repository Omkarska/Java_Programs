import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longestLength = 0;

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        // Check each element for consecutive sequence
        for (int num : nums) {
            // If the current element is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Find the length of the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int length = longestConsecutive(nums);
        System.out.println("The longest consecutive elements sequence length is: " + length);

        scanner.close();
    }
}

// import java.util.HashSet;
// import java.util.Scanner;

// public class LongestConsecutiveSequence {
// public static int[] longestConsecutive(int[] nums) {
// HashSet<Integer> set = new HashSet<>();
// int longestLength = 0;
// int startNum = 0;

// // Add all elements to the set
// for (int num : nums) {
// set.add(num);
// }

// // Check each element for consecutive sequence
// for (int num : nums) {
// // If the current element is the start of a sequence
// if (!set.contains(num - 1)) {
// int currentNum = num;
// int currentLength = 1;

// // Find the length of the consecutive sequence
// while (set.contains(currentNum + 1)) {
// currentNum++;
// currentLength++;
// }

// if (currentLength > longestLength) {
// longestLength = currentLength;
// startNum = num;
// }
// }
// }

// int[] consecutiveArray = new int[longestLength];
// for (int i = 0; i < longestLength; i++) {
// consecutiveArray[i] = startNum + i;
// }

// System.out.println("The longest consecutive elements sequence length is: " +
// longestLength);
// return consecutiveArray;
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter the number of elements in the array: ");
// int n = scanner.nextInt();
// int[] nums = new int[n];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < n; i++) {
// nums[i] = scanner.nextInt();
// }

// int[] consecutiveArray = longestConsecutive(nums);

// System.out.println("The consecutive elements array:");
// for (int num : consecutiveArray) {
// System.out.print(num + " ");
// }

// scanner.close();
// }
// }
