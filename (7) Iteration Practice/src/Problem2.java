import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        //Problem 2 (ask for num, ask how many times to double, sout total)
        // num * 2 to the power of doublee
        System.out.println("Problem 2: Double Up");
        Scanner hoia = new Scanner(System.in);
        System.out.println("Choose a number:");
        int num = hoia.nextInt();
        System.out.println("double by...");
        int doublee = hoia.nextInt();
        System.out.println("Your original number is:  " + num);
        System.out.println("You double it " + doublee + " times");
        System.out.print(num);
        for (int i = 0; i < doublee; i++)
            System.out.print("x2");

    }
}
