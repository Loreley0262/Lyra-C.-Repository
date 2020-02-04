import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] city = new int[5];
        int[] dist = new int[5];
        city[0]=0;
        city[1]=3;
        city[2]=10;
        city[3]=12;
        city[4]=5;

        //input 3, 10, 12, 5
        /*
        0 3 13 25 30
        3 0 10 22 27
        13 10 0 12 17
        25 22 12 0 5
        30 27 17 5 0
        */

        System.out.println("3 10 12 5\n"); //remove later

        for(int j=0; j<5; j++){
            for(int i=0; i<5; i++){
            dist[j] = city[i];
            }
        }

        dist[0] = 0;
        dist[1] = city[1] - city[0];
        dist[2] = city[2] + city[1] - city[0];
        dist[3] = city[3] + city[2] + city[1] - city[0];
        dist[4] = city[4] + city[3] + city[2] + city[1] - city[0];
        System.out.println(dist[0] +" "+ dist[1] +" "+ dist[2] +" "+ dist[3] +" "+ dist[4]);


        dist[0] = dist[1];
        dist[1] = 0;
        dist[2] = dist[2] - city[1];
        dist[3] = dist[3] -city[1];  //25
        dist[4] = dist[4] - city[1];
        System.out.println(dist[0] +" "+ dist[1] +" "+ dist[2] +" "+ dist[3] +" "+ dist[4]);


        dist[0] = city[2] + city[1];
        dist[1] = (city[2] + city[1]) - city[1];
        dist[2] = 0;
        dist[3] = ((city[3] + city[2] + city[1]) -city[1]) - city[2];
        dist[4] = ((city[4] + city[3] + city[2] + city[1]) - city[1]) - city[2];
        System.out.println(dist[0] +" "+ dist[1] +" "+ dist[2] +" "+ dist[3] +" "+ dist[4]);

        dist[0] = 12 + 10 + 3;
        dist[1] = 12 + 10;
        dist[2] = 12;
        dist[3] = 0;
        dist[4] = 5;
        System.out.println(dist[0] +" "+ dist[1] +" "+ dist[2] +" "+ dist[3] +" "+ dist[4]);


        //-------------------------------

//        dist[0] = 0;
//        dist[1] = city[1] - city[0];
//        dist[2] = city[2] + dist[1] - city[0];
//        dist[3] = city[3] + dist[2] - city[0];
//        dist[4] = city[4] + dist[3] - city[0];
//        for(int i=0; i<5; i++){
//            dist[i] = city[i];
//        }

        dist[0] = dist[1];
        dist[1] = 0;
        dist[2] = dist[2] - city[1];
        dist[3] = dist[3] -city[1];  //25
        dist[4] = dist[4] - city[1];
        System.out.println(dist[0] +" "+ dist[1] +" "+ dist[2] +" "+ dist[3] +" "+ dist[4]);

        System.out.println("\n\n");
        for (int j=0; j<5; j++){                          //j is row?
            for (int i=0; i<5; i++){                      //i is column?
                if (j==i){
                    dist[i] = 0;
                }
                else if (j==0){
                    dist[i] = dist[i] + dist[i-1];
                }
                else{
                    dist[i] = dist[i] + dist[i-1];
                }
//                dist[2] = city[2] + city[1] - city[0];
//                dist[3] = city[3] + city[2] + city[1] - city[0];
//                dist[4] = city[4] + city[3] + city[2] + city[1] - city[0];
            }
            System.out.println(dist[0] +" "+ dist[1] +" "+ dist[2] +" "+ dist[3] +" "+ dist[4]);
        }



    }
}
/*

*/
