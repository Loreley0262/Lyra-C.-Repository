import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        numOfSpaces = NUMBER OF SPACES
//        byeByeYesterday = YESTERDAY
//        hiHiToday = TODAY

        System.out.println("How many parking spaces are in the row in total? There must be at least 1 space and less than 100 spaces");
        int numOfSpaces = scan.nextInt(); //NUM OF SPACES

        while (numOfSpaces<1 || numOfSpaces>100) {
            System.out.println("no retry your num.");
        }

        System.out.println("Using the character \"C\" for filled spaces and \".\" for empty spaces," +
                " input the status of the parking lot as it was yesterday.");
        String byeByeYesterday = scan.next();

        if (byeByeYesterday.length()!= numOfSpaces){
            System.out.println("nonon retry");
        }


        System.out.println("Using the character \"C\" for filled spaces and \".\" for empty spaces," +
                " input the status of the parking lot as it is today.");
        String hiHiToday = scan.next();

        for (int i=0; i<numOfSpaces; i++){
            //somehow search the string for both places w/C
        }
    }
}
