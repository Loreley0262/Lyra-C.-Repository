import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDistrict() {
        return district;
    }
    public void setDistrict(int district) {
        this.district = district;
    }
    public int getIden() {
        return iden;
    }
    public void setIden(int iden) {
        this.iden = iden;
    }

    String name;
    int district;
    int iden;

    public void addTeacher(){       //adds a teacher to the teachers ArrayList
        teachers.add(new Teacher("Teach", "er", "Computers"));
    }
    public void addStudent(){       //adds a student to the student ArrayList
        students.add(new Student("Stu", "dent", 10));
    }
    public void delTeacher(){       //removes a teacher to the teacher ArrayList
        ArrayList<Teacher> teachers2 = new ArrayList<>(teachers);
        teachers2.remove(0);
        teachers = teachers2;
    }
    public void delStudent(){       //removes a student to the student ArrayList
        ArrayList<Student> students2 = new ArrayList<>(students);
        students2.remove(0);
        students = students2;
    }
    public void showTeachers(){       //shows all teachers in teachers ArrayList
        for (int i = 0; i<teachers.size(); i++){
            System.out.println(teachers.get(i));
        }
    }
    public void showStudents(){
        for (int i = 0; i<students.size(); i++){
            System.out.println(students.get(i));
        }
    }

    School(String name, int district, int id){
        this.name = name;
        this.district = district;
        this.iden = id;
    }

}
