public class Courses {
    String name;
    int beforeGrade;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBeforeGrade() {
        return beforeGrade;
    }
    public void setBeforeGrade(int beforeGrade) {
        this.beforeGrade = beforeGrade;
    }





    Courses(String name, int grade){
        this.name = name;
        this.beforeGrade = grade;
        beforeGrade++;
    }

}
