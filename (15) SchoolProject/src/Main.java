public class Main {
    public static void main(String[] args) {

        //The main class is the where you call and use code stored in other classes.

        School windi = new School("Windi", 39, 1);  //made a school object called "windi"

        for (int i = 0; i<10; i++){ // adding 10 students to the school "windi"
            windi.addStudent();
        }
        for (int i = 0; i<3; i++){ // adding 3 teachers to the school "windi"
            windi.addTeacher();
        }

        windi.showTeachers();  //print out all the teachers in the teachers ArrayList
        windi.showStudents();  //print out all the students in the students ArrayList

        for (int i = 0; i<2; i++){ //deleting 2 students from the students ArrayList
            windi.delStudent();
        }

        windi.delTeacher();  //deleting a teacher from the teachers ArrayList

        windi.showTeachers();  //print out all the teachers in the teachers ArrayList
        windi.showStudents();  //print out all the students in the students ArrayList


    }
}
