import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        Prime.checkPrime(num);
    }

    static void checkPrime(int num) {
        int count = 0;
        for (int i = 1; i < num + 1; i++) {
            if (num % i == 0) {
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        if (count < 3) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
    }
}