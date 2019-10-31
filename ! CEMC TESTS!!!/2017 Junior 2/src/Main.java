import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int origNum = scan.nextInt();
        while (origNum<1 || origNum>10000){
            origNum = scan.nextInt();
        }

        int shift = scan.nextInt();
        while (shift<0 || shift>5){
            shift = scan.nextInt();
        }
        int[] arrayEtShifted = new int[7];
        arrayEtShifted[0] = origNum;

        for (int i=1; i<=shift; i++){
            arrayEtShifted[i] = arrayEtShifted[i-1]*10;
        }

        for (int i=0; i<=shift; i++){
            arrayEtShifted[6] = arrayEtShifted[6]+arrayEtShifted[i];
        }
        System.out.println(arrayEtShifted[6]);

    }
}
