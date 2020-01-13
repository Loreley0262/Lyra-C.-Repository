public class Courses {
    String name;
    int grade;

    public String getName() {
        return name;
    }
    public int grade() {
        return grade;
    }
    public int getGrade() {
        return grade;
    }

    public String toString(){
        return "Subject: " + getName();
    }

    public int asdf(){
        return this.grade;
    }

    Courses(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

}
