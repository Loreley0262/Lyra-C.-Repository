import java.util.ArrayList;

public class School {
    /*
    The School class is where all data related to the school is kept. It contains the lists of staff and students,
    code to add, delete, and show staff in students in said lists, and the school constructor.
    */

    ArrayList<Teacher> teachers = new ArrayList<>();  //An array list to hold all the teachers in each school
    ArrayList<Student> students = new ArrayList<>();  //An array list to hold all the students in each school

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
    public void addStudent(){       //adds a student to the students ArrayList
        students.add(new Student("Stu", "dent", 10));
    }
    public void delTeacher(){       //removes a teacher to the teachers ArrayList
        ArrayList<Teacher> teachers2 = new ArrayList<>(teachers);
        teachers2.remove(0);
        teachers = teachers2;
    }
    public void delStudent(){       //removes a student to the students ArrayList
        ArrayList<Student> students2 = new ArrayList<>(students);
        students2.remove(0);
        students = students2;
    }
    public void showTeachers(){       //prints all teachers in teachers ArrayList
        for (int i = 0; i<teachers.size(); i++){
            System.out.println(teachers.get(i));
        }
    }
    public void showStudents(){       //prints all students in students ArrayList
        for (int i = 0; i<students.size(); i++){
            System.out.println(students.get(i));
        }
    }

    School(String name, int district, int id){    //School constructor creates new schools, each with a name, district, and id number.
        this.name = name;
        this.district = district;
        this.iden = id;
    }

}
