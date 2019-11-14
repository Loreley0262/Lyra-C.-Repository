import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //----------------------------THe NuMbeRs!----------------------------
        int a = scan.nextInt();
        while (a<-1000||a>1000){
            a = scan.nextInt();
        }
        int b = scan.nextInt();
        while (b<-1000||b>1000){
            b = scan.nextInt();
        }
        int c = scan.nextInt();
        while (c<-1000||c>1000){
            c = scan.nextInt();
        }
        int d = scan.nextInt();
        while (d<-1000||d>1000){
            d = scan.nextInt();
        }
        int e = scan.nextInt();
        while (e<0||e>10000){
            e = scan.nextInt();
        }


        int g=(a-c);
        int h =(b-d);
        g = Math.abs(g);
        h = Math.abs(h);
        int i = g+h;
        //------------------------------yOrN?----------------------------------
        if (e>=i) {
            if (e % 2 == 0 && i % 2 == 0) {
                System.out.println("Y");
            } else if (e % 2 != 0 && i % 2 != 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
        else{
            System.out.println("N");
        }
    }
}
