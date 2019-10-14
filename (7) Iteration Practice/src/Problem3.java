import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Problem 3(input age, check if between 10-50. If not, reinput)

        System.out.println("Input your age:");
        int age = scan.nextInt();

        while ((age<10) || (age>50)) {
            System.out.println("Reinput your age:");
            age = scan.nextInt();
        }

        System.out.println("Yay you did it!");

    }
}
