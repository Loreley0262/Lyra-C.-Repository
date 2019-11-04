public class ArrayButMethods {
    //Add values to the end of an array. (-----DONE?-----)
    //Delete values from the end of an array (often referred to as pop).  Array size should shrink by one.(-----DONE?-----)
    //Insert values into an array at chosen index position.(-----DONE?-----)
            //(Increases the size of the array by 1 Ex. array 2, 3, 5.  Insert 4 into position 2 gives 2,3,4,5)

    public static void main(String[] args) {
       addToArray();
       delFromArray();
       putIntoArray();
    }
    

    public static void addToArray(){
        int k = 3;
        int[] ayray = new int[k];
        for (int i=0; i<k; i++) {
            ayray[i] = i;
            System.out.println(ayray[i]);
        }
        int nom= k+1;
        int[] rayray = new int[nom];
        for (int i=0; i<nom; i++) {
            if (i==k){
                rayray[i] = i;
            }
            else{
                rayray[i] = ayray[i];
            }
            System.out.println(rayray[i]);
        }
        System.out.println("----------------------------");
    }

    public static void delFromArray(){
        int k = 3;
        int[] ayray = new int[k];
        for (int i=0; i<k; i++) {
            ayray[i] = i;
            System.out.println(ayray[i]);
        }
        int nom= k-1;
        int[] rayray = new int[nom];
        for (int i=0; i<nom; i++) {
            rayray[i] = ayray[i];
            System.out.println(rayray[i]);
        }
        System.out.println("----------------------------");
    }

    public static void putIntoArray(){
        int k = 3;
        int[] ayray = new int[k];
        for (int i=0; i<k; i++) {
            ayray[i] = i;
            System.out.println(ayray[i]);
        }
        int nom= k+1;
        int[] rayray = new int[nom];
        for(int i=0; i<nom; i++){
            if (i<1){
                rayray[i] = ayray[i];
            }
            if (i==1){
                rayray[i]= nom;
            }

            if(i>1){
                rayray[i] = ayray[i-1];
            }
            System.out.println(rayray[i]);
        }
    }



}
