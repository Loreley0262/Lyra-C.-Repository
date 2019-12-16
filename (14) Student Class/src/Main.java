import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Courses> courses = new ArrayList<>();          //add courses before using them! order matters
        Courses math = new Courses("Math", 90);
        courses.add(math);

        Student john = new Student("John", 1, math);

    }
}
