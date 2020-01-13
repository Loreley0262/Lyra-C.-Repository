public class Courses {
    String name;
    int grade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int grade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString(){
        return "Subject: " + getName();
    }



    Courses(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

}
