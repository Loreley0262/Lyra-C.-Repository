import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        //Problem 5 (input password. confirm pass. pass must == pass.)
        // Note remember how to check equality of strings.

        Scanner scan = new Scanner(System.in);

        String[] grds = new String[2];


        while (true) {
            System.out.println("Create a password!");
            grds[0] = scan.next();
            System.out.println("Confirm password");
            grds[1] = scan.next();

            if (grds[0].equals(grds[1])) {
                System.out.println("Yay! It is matched!");
                break;
            }

            else {
                System.out.println("Retry");
            }


        }
    }
}