import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " added to " + name + "'s courses.");
    }

    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " removed from " + name + "'s courses.");
        } else {
            System.out.println(course + " is not found in " + name + "'s courses.");
        }
    }

    public void displayCourses() {
        System.out.println(name + "'s courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("Omkar Kanase", 10);

        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");

        student.displayCourses();

        student.removeCourse("Science");
        student.removeCourse("History");

        student.displayCourses();
    }
}
