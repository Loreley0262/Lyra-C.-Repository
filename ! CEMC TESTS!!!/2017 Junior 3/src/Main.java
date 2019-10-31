import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // IS IT POSSIBLE TO GO FROM 1ST INPUT TO 2ND INPUT WITH EXACTLY t CHARGE?
                //1st input = a then b {(a,b)}
                    //is starting coordinate
                    //(−1000 ≤ a ≤ 1000; −1000 ≤ b ≤ 1000)
                // 2nd input = c then d {(c,d)}
                    // destination coordinate
                    //(−1000 ≤ c ≤ 1000; −1000 ≤ d ≤ 1000)
                //3rd input = int t(0 ≤ t ≤ 10 000)
                    //initial # o/charge in battery
                //BONUS MARKS BELOW!!
                //0 ≤ a, b, c, d ≤ 2
                //t ≤ 8.

        Scanner scan = new Scanner(System.in);
        //----------------------------THe NuMbeRs!----------------------------
        int a = scan.nextInt();
        while (a<-1000 || a >1000){
            a = scan.nextInt();
        }
        int b = scan.nextInt();
        while (b<-1000 || b >1000){
            b = scan.nextInt();
        }
        int c = scan.nextInt();
        while (c<-1000 || c >1000){
            c = scan.nextInt();
        }
        int d = scan.nextInt();
        while (d<-1000 || d >1000){
            d = scan.nextInt();
        }
        int charge = scan.nextInt();
        while (charge<0 || charge >10000){
            charge = scan.nextInt();
        }
        //------------------------------yOrN?------------------------------
    }
}

//        String aString = "" + a;
//        String bString = "" + b;
//        String ab = aString+bString;
//        System.out.println(ab);
