import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Courses> courses = new ArrayList<>();          //add courses before using them! order matters
        courses.add(new Courses("PE", 10));
        System.out.println(courses.get(0).getName());
        System.out.println(courses.get(0).getBeforeGrade());

        courses.add(new Courses("Sci", 10));
        System.out.println(courses.get(1).getName());
        System.out.println(courses.get(1).getBeforeGrade());


        ArrayList<Student> student = new ArrayList<>();

        Scanner scan = new Scanner (System.in);
        System.out.println("how many students made");
        int x = scan.nextInt();

        for (int i=0; i<x; i++){

        }

        Student john = new Student("John", 1);
        System.out.println(john.beforeId);
        Student joe = new Student("Joe", 1);
        System.out.println(joe.beforeId);

    }
}
