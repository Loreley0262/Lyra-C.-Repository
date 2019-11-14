import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] city = new int[5];
        int[] distances = new int[5];
        city[0]=0;
        for (int i=1; i<4; i++){
            city[i] = scan.nextInt();
            System.out.print(city[i] + " ");
        }
        for (int i=0; i<5; i++){
            distances[i] = city[i]+city[i+1];
            System.out.print(distances[i] + " ");
        }

    }
}
