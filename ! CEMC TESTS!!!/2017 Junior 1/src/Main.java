import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // using x and y find the quadrant its in (Quadrant Selection!!!)
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while (x<-1000 || x>1000 || x==0){
            x = scan.nextInt();
        }
        while (y<-1000 || y>1000 || y==0){
            y = scan.nextInt();
        }
        if (x>0 && y>0) {
            System.out.println(1);
        }
        if (x<0 && y>0) {
            System.out.println(2);
        }
        if (x<0 && y<0) {
            System.out.println(3);
        }
        if (x>0 && y<0) {
            System.out.println(4);
        }



    }
}
