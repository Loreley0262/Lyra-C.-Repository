public class ArrayButMethods {
    //Add values to the end of an array. (-----addToArray-----)
    //Delete values from the end of an array (often referred to as pop).  Array size should shrink by one.(-----delFromArray-----)
    //Insert values into an array at chosen index position.(-----putIntoArray-----)
            //(Increases the size of the array by 1 Ex. array 2, 3, 5.  Insert 4 into position 2 gives 2,3,4,5)

    public static void main(String[] args) {
        int k = 6; //Length of the original array
       addToArray(k, k+2);
       delFromArray(k, k-2);
       putIntoArray(k, k-2);
    }

    public static void addToArray(int k, int num){
        System.out.println("Adding to the array:");
        System.out.print("origArray   =  ");
        int[] origArray = new int[k];
        for (int i=0; i<k; i++) {
            origArray[i] = i; //OPTIONS!
            System.out.print("\t["+i+"]"+ "=" +origArray[i]);
        }
        System.out.print("\nmoddedArray =  \b");
        int[] moddedArray = new int[num];
        for (int i=0; i<num; i++) {
            if (i==k){
                moddedArray[i] = i;
            }
            else if (i>origArray.length){
                moddedArray[i] = i;
            }
            else{
                moddedArray[i] = origArray[i];
            }
            System.out.print("\t["+i+"]"+ "=" +moddedArray[i]);
        }
        if (num == 0){
            System.out.print("There's nothing here!");
        }
        System.out.println("\n----------------------------------------------------------");
    }

    public static void delFromArray(int k, int num){
        System.out.println("Deleting from the array:");
        System.out.print("origArray   =  ");
        int[] origArray = new int[k];
        for (int i=0; i<k; i++) {
            origArray[i] = i;
            System.out.print("\t["+i+"]"+ "=" +origArray[i]);
        }
        System.out.print("\nmoddedArray =  \b");
        int[] moddedArray = new int[num];
        for (int i=0; i<num; i++) {
            moddedArray[i] = origArray[i];
            System.out.print("\t["+i+"]"+ "=" +moddedArray[i]);
        }
        if (num == 0){
            System.out.print("There's nothing here!");
        }
        System.out.println("\n----------------------------------------------------------");
    }

    public static void putIntoArray(int k, int num){
        System.out.println("Inserting a number into the array:");
        System.out.print("origArray   =  ");
        int[] origArray = new int[k];
        for (int i=0; i<k; i++) {
            origArray[i] = i;
            System.out.print("\t["+i+"]"+ "=" +origArray[i]);
        }
        System.out.print("\nmoddedArray =  \b");
        int[] moddedArray = new int[num];
        for(int i=0; i<num; i++){
            if (i<1){
                moddedArray[i] = origArray[i];
            }
            if (i==1){
                moddedArray[i]= num;
            }

            if(i>1){
                moddedArray[i] = origArray[i-1];
            }
            System.out.print("\t["+i+"]"+ "=" +moddedArray[i]);
        }
        if (num == 0){
            System.out.print("There's nothing here!");
        }
    }



}
