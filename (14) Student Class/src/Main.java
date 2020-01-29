import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student bob = new Student("Bob");
        bob.addCourses();
        bob.addCourses();
        bob.addCourses();
        bob.addCourses();
        bob.printCourses();
        System.out.println(bob);

        Student john = new Student("John");
        john.addCourses();
        System.out.println(john);

        System.out.println();
        System.out.println();
        System.out.println(bob.averageGrade());

    }

}


