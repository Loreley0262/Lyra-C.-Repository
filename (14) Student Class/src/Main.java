import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Courses> bobCourses = new ArrayList<>();
        bobCourses.add(new Courses("pe", 50));     // 0
        bobCourses.add(new Courses("sci", 30));    // 1
        bobCourses.add(new Courses("gui", 90));    // 2
        bobCourses.add(new Courses("ss", 100));     // 3
        Student bob = new Student("Bob", 0);
        System.out.println(bob);
        System.out.println(bobCourses.get(0));

        ArrayList<Courses> johnCourses = new ArrayList<>();
        johnCourses.add(new Courses("pe", 10));     // 0
        johnCourses.add(new Courses("sci", 10));    // 1
        johnCourses.add(new Courses("gui", 10));    // 2
        johnCourses.add(new Courses("ss", 10));     // 3
        Student john = new Student("John", 0);
        System.out.println(john);
        System.out.println(johnCourses.get(2));


        System.out.println();
        System.out.println();
        System.out.println((50+30+90+100) / 4);
        int avg = 0;

        //for (int i = 0; i<bobCourses.size(); i++){
        //     avg = avg + ;
        // }

        System.out.println(bobCourses.size());
        System.out.println(johnCourses); //in courses class, fix!

/*        for (Test c : cars){ //colon is "in" so c is like i but for every car?
            System.out.println(c);
*/        }

    }



}