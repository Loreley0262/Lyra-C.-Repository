import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] city = new int[5];
        int[] misc = new int[5];
        city[0]=0;
        for (int i=1; i<5; i++){
            city[i] = scan.nextInt();
        }
        int k = 0;
        for (int j=0; j<5; j++) {
            for (int i = 0; i < 5; i++) {
                if (i==k){
                    misc[j]=0;
                }
                else{
                    misc[j] = misc[j] + city[k] + city[i];
                }
                System.out.print(misc[j] + "\t");
            }
            System.out.println("\n");
            k++;
        }
    }
}
/*
  misc[j] = misc[j] + city[1] + city[i];

0   3    10      12      5

*/