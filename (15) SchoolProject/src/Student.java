public class Student {
    /*
    The Student class is where data about the students is stored. It contains the first, last, and full names of students,
    the grade each student is in, the id number of each student, the toString method to print the name and grade of each student,
    and the Student constructor to create new students. This class is also used to create the students array list in the School class.
    */

    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getName() {
        return getfName() + " " + getlName();
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Student.id = id;
    }

    String fName;
    String lName;
    String name;
    int grade;
    static int id;


    public String toString(){       //toString method prints the name and grade of the student
        return "Name: " + getName() + " Grade: " + grade;
    }

    Student (String fName, String lName, int grade){        //Student constructor creates new students with a first and last name and grade.
        this.fName = fName;
        this.lName = lName;
        this.grade = grade;
    }
}
