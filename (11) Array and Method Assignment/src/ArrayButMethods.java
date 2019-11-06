public class ArrayButMethods {
    //Add values to the end of an array. (-----addToArray-----)
    //Delete values from the end of an array (often referred to as pop).  Array size should shrink by one.(-----delFromArray-----)
    //Insert values into an array at chosen index position.(-----putIntoArray-----)
            //(Increases the size of the array by 1 Ex. array 2, 3, 5.  Insert 4 into position 2 gives 2,3,4,5)

    public static void main(String[] args) {
        int l = 3;
        int m = l+1;
        int n = l-1;
       addToArray(l, m);
       delFromArray(l, n);
       putIntoArray(l, m);
    }

    public static void addToArray(int k, int nom){
        System.out.print("origArray   =  ");
        int[] origArray = new int[k];
        for (int i=0; i<k; i++) {
            origArray[i] = i; //OPTIONS!
            System.out.print("\t["+i+"]"+ "=" +origArray[i]);
        }
        System.out.print("\nmoddedArray =  \b");
        int[] moddedArray = new int[nom];
        for (int i=0; i<nom; i++) {
            if (i==k){
                moddedArray[i] = i;
            }
            else{
                moddedArray[i] = origArray[i];
            }
            System.out.print("\t["+i+"]"+ "=" +moddedArray[i]);
        }
        System.out.println("\n----------------------------\n");
    }

    public static void delFromArray(int k, int nom){
        System.out.print("origArray   =  ");
        int[] origArray = new int[k];
        for (int i=0; i<k; i++) {
            origArray[i] = i;
            System.out.print("\t["+i+"]"+ "=" +origArray[i]);
        }
        System.out.print("\nmoddedArray =  \b");
        int[] moddedArray = new int[nom];
        for (int i=0; i<nom; i++) {
            moddedArray[i] = origArray[i];
            System.out.print("\t["+i+"]"+ "=" +moddedArray[i]);
        }
        System.out.println("\n----------------------------\n");
    }

    public static void putIntoArray(int k, int nom){
        System.out.print("origArray   =  ");
        int[] origArray = new int[k];
        for (int i=0; i<k; i++) {
            origArray[i] = i;
            System.out.print("\t["+i+"]"+ "=" +origArray[i]);
        }
        System.out.print("\nmoddedArray =  \b");
        int[] moddedArray = new int[nom];
        for(int i=0; i<nom; i++){
            if (i<1){
                moddedArray[i] = origArray[i];
            }
            if (i==1){
                moddedArray[i]= nom;
            }

            if(i>1){
                moddedArray[i] = origArray[i-1];
            }
            System.out.print("\t["+i+"]"+ "=" +moddedArray[i]);
        }
    }



}
