public class tst {
    public static void main(String[] args) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] betabet = "azcbobobegghakl".toCharArray();

        if (betabet[0]>=alphabet[1]){
            System.out.println("yee");
        }
        else{
            System.out.println("noo");
        }

        /* this works because individual chars in the char array (so the letters themselves) have a value in ASCII
         so a=65, etc
         so you can compare the nums (a65) to (b66)
         to see alphaorders
        */
    }
}
