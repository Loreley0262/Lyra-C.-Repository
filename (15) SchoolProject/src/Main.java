public class Main {
    public static void main(String[] args) {

        School windi = new School("Windi", 39, 1);

        for (int i = 0; i<10; i++){
            windi.addStudent();
        }
        for (int i = 0; i<3; i++){
            windi.addTeacher();
        }

        windi.showTeachers();
        windi.showStudents();

        for (int i = 0; i<2; i++){
            windi.delStudent();
        }

        windi.delTeacher();

        windi.showTeachers();
        windi.showStudents();


    }
}
