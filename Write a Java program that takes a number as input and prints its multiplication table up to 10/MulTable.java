import java.util.Scanner;

public class MulTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        System.out.println("Table of " + num);
        MulTable.generateTable(num);
    }

    static void generateTable(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}