import java.util.Scanner;

public class IterationPractice {
    public static void main(String[] args) {

        //Problem 1 (user must enter int 7)
        System.out.println("Problem 1: Correct Number");
        Scanner intt = new Scanner(System.in);
        boolean asdf = true;
        while (asdf) {
            System.out.println("Type in the number 7");
            int seven = intt.nextInt();
            if (seven == 7){
                System.out.println("You did it! YAY!");
                asdf = false;
            }
            else{
                System.out.println("Do it right, dum dum!");
            }
        }
    }
}
