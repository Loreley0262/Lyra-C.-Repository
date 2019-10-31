public class Main {
    public static void main(String[] args) {

        //------------------------------how many "1"s are in the array?----------------------------------------
        int[] oneArray = new int[20];
        int one = 0;
        for (int i=0; i<oneArray.length; i++) {
            oneArray[i] = (int) (Math.random() * 6 + 1);
            if (oneArray[i] == 1){
                one++;
            }
        }
        System.out.println("There are " + one + " \"ones\" in the first array.\n");

        //---------------------what is the avg of the numbers in the array?------------------------------------
        int[] twoArray = new int[10];
        int avg = 0;
        for (int i=0; i<twoArray.length; i++) {
            twoArray[i] = (int) (Math.random() * 100 + 1);
            avg = avg + twoArray[i];
        }
        System.out.println("The average of the numbers in the second array is " + avg/twoArray.length + "\n");

        //------------------------------switching first and 3rd ints-------------------------------------------
        int[] threeArray = new int[10];
        for (int i=0; i<threeArray.length; i++){
            threeArray[i] = (int) (Math.random() * 6 + 1);
            System.out.print(i+" = " + threeArray[i] + "\t");
        }
        int switcharoo = threeArray[0];
        threeArray[0] = threeArray[2];
        threeArray[2] = switcharoo;
        System.out.println("\nNow,  threeArray[0] = " + threeArray[0]);
        System.out.println("Now,  threeArray[2] = " + threeArray[2]);
        for (int i=0; i<threeArray.length; i++){
            System.out.print(i+" = " + threeArray[i] + "\t");
        }

        //------------------------------------reverse rotation!-----------------------------------------------
        int[] fourArray = new int[10];
        int k = fourArray.length;
        for (int i=0; i<fourArray.length; i++){
            fourArray[i] = threeArray[i];
        }
        System.out.println("\nAfter the reversal, the numbers are:");
        for (int i=0; i<fourArray.length; i++){
            fourArray[i] = threeArray[k -1-i];
            System.out.print(i+" = " + fourArray[i] + "\t");
        }
    }
}
