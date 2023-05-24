abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;

    public A(double subject1Marks, double subject2Marks, double subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject1Marks + subject2Marks + subject3Marks;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    private double subject4Marks;

    public B(double subject1Marks, double subject2Marks, double subject3Marks, double subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
        return (totalMarks / 400) * 100;
    }
}

public class MarksPercentage {
    public static void main(String[] args) {
        // Create an object for student A
        A studentA = new A(80, 90, 85);
        double percentageA = studentA.getPercentage();
        System.out.println("Percentage of Student A: " + percentageA);

        // Create an object for student B
        B studentB = new B(75, 85, 80, 90);
        double percentageB = studentB.getPercentage();
        System.out.println("Percentage of Student B: " + percentageB);
    }
}
