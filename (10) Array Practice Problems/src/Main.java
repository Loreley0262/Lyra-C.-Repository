public class Main {
    public static void main(String[] args) {

        //------------------------------how many "1"s are in the array?----------------------------------------
        int[] onesArray = new int[20];
        int one = 0;
        for (int i=0; i<onesArray.length; i++) {
            onesArray[i] = (int) (Math.random() * 6 + 1);
            System.out.print("["+i+"] = " + onesArray[i] + "\t");
            if (onesArray[i] == 1){
                one++;
            }
        }
        System.out.println("\nThere are " + one + " \"ones\" in the first array.\n");

        //---------------------what is the avg of the numbers in the array?------------------------------------
        int[] avgArray = new int[10];
        int avg = 0;
        for (int i=0; i<avgArray.length; i++) {
            avgArray[i] = (int) (Math.random() * 100 + 1);
            avg = avg + avgArray[i];
        }
        System.out.println("The average of the numbers in the second array is " + avg/avgArray.length + "\n");

        //------------------------------switching first and 3rd ints-------------------------------------------
        for (int i=0; i<avgArray.length; i++){
            avgArray[i] = (int) (Math.random() * 6 + 1);
            System.out.print(i+" = " + avgArray[i] + "\t");
        }
        int switcharoo = avgArray[0];
        avgArray[0] = avgArray[2];
        avgArray[2] = switcharoo;
        System.out.println("\nNow,  avgArray[0] = " + avgArray[0]);
        System.out.println("Now,  avgArray[2] = " + avgArray[2]);
            for (int i=0; i<avgArray.length; i++){
            System.out.print(i+" = " + avgArray[i] + "\t");
        }

        //------------------------------------reverse rotation!-----------------------------------------------
        System.out.println("");
        int k = avgArray.length;
        for (int i=0; i<avgArray.length; i++){
            avgArray[i] = avgArray[i];
        }
        System.out.println("\nAfter the reversal, the numbers are:");
        for (int i=0; i<avgArray.length; i++){
            avgArray[i] = avgArray[k -1-i];
            System.out.print(i+" = " + avgArray[i] + "\t");
        }
    }
}
