import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        numOfSpaces = NUMBER OF SPACES
//        byeByeYesterday = YESTERDAY's space
//        hiHiToday = TODAY's space
//        sames = counter for correct thingy


        int numOfSpaces = 0;

        do {
            //System.out.println("How many parking spaces are in the row in total? There must be at least 1 space and less than 100 spaces");
            numOfSpaces = scan.nextInt(); //NUM OF SPACES
        } while (numOfSpaces < 1 || numOfSpaces > 100);


        //System.out.println("Using the character \"C\" for filled spaces and \".\" for empty spaces," +
        //        " input the status of the parking lot as it was yesterday.");
        String byeByeYesterday= scan.next();


        //System.out.println("Using the character \"C\" for filled spaces and \".\" for empty spaces," +
        //        " input the status of the parking lot as it is today.");
        String hiHiToday = scan.next();

        int sames = 0;
        int hoia = 0; //testing
        for (int i = 0; i < numOfSpaces; i++) {
            String yesterdayC = byeByeYesterday.substring(i, i+1);
            String todayC = hiHiToday.substring(i, i+1);
            if (yesterdayC.equals("C")) {
                if (yesterdayC.equals(todayC)) {
                    sames++;
                }
            }
        }
        System.out.println(sames);

    }
}



