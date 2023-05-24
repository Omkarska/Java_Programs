class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
}

public class Tester {
    public static void main(String[] args) {
        Adder adder = new Adder();

        // Printing superclass name
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        // Addition using the add method from superclass
        int num1 = 42;
        int num2 = 13;
        int sum = adder.add(num1, num2);
        System.out.println(num1 + " " + num2 + " " + sum);
    }
}
