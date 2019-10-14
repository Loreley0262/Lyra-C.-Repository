import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //Problem 4 (ask how many % will enter, loop so can input that many %s. then print sum and avg of grades)



        Scanner scan = new Scanner(System.in);
        System.out.println("How many grades will you enter?");
        int num = scan.nextInt(); // num of grades!

        System.out.println("Enter your grades (as a percent plz!):");
        int[] grds = new int[num]; // this is the list


        for(int i=0; i< num; i++) {
            grds[i] = scan.nextInt(); // this is the scanner to make the list
        }

        int hoia = 0;
        for (int a = 0; a <num; a++){
            hoia = hoia + grds[a]; // this is supposed to be the sum of grades
        }

        System.out.println("Your average grade is:  " + hoia/num + "%");

    }
}
