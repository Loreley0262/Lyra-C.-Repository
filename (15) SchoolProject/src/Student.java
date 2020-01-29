public class Student {
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

    String fName;
    String lName;
    String name;
    int grade;

    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Student.id = id;
    }

    static int id;

    public int getIden() {
        return iden;
    }
    public void setIden(int iden) {
        this.iden = iden;
    }

    int iden;

    public String toString(){
        return "Name: " + getName() + " Grade: " + grade + "id(temp)" + id;
    }

    Student (String fName, String lName, int grade){
        this.fName = fName;
        this.lName = lName;
        this.grade = grade;
        this.iden = id;
        id = iden;
        iden++;
    }
}
