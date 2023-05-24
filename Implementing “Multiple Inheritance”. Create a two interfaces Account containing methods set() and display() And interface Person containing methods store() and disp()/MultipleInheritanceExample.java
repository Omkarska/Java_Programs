import java.util.Scanner;

interface Account {
    void set(String accountNumber, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Person, Account {
    private String name;
    private String accountNumber;
    private double balance;

    public void set(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public void store(String name) {
        this.name = name;
    }

    public void disp() {
        System.out.println("Customer Name: " + name);
    }

    public void calculateInterest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest added. Updated balance: $" + balance);
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        customer.store(name);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();

        customer.set(accountNumber, balance);

        System.out.println("\nCustomer Information:");
        customer.disp();
        customer.display();

        System.out.print("\nEnter interest rate (%): ");
        double interestRate = scanner.nextDouble();

        customer.calculateInterest(interestRate);

        scanner.close();
    }
}
