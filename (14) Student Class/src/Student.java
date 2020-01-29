import java.util.ArrayList;

public class Student {
    ArrayList<Courses> courses = new ArrayList<>();
    int[] grades = new int[8];

    private static int iden;
    private String name;
    int y =0;

    public int getIden() {
        return iden;
    }
    public String getName() {
        return name;
    }
    public void addCourses(){
        int x = (int)(Math.random()*100-1);
        courses.add(new Courses("course name",  x));
        grades[y] = x;
        y++;
        System.out.println(x);
        System.out.println(y);
    }
    public int averageGrade(){
        int avg = 0;
        for (int i=0; i<courses.size(); i++){
            avg = avg + grades[i];
        }

        return avg/courses.size();
    }
    public void printCourses(){
        for (int i=0; i<courses.size(); i++){
            System.out.println(courses.get(i));
        }
    }

    public String toString(){
        return "Name: " + getName() + "\tID: " + getIden();
    }

    Student(String firstName){
        this.name = firstName;
        iden++;
    }


}
