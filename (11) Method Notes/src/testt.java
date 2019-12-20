public class testt {
    static String testt(String s) {           //azcbobobegghakl
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] betabet = s.toCharArray();
        String yee = "";
        int k=0;
        for (int j = 0; j<betabet.length; j++) {
            for (int i=k;i<alphabet.length; i++) {
                if (betabet[j] == alphabet[i] && i>=j) {
                    yee = yee + betabet[j];
                    k=i;
                    break;
                }
            }
            String[] ordered= new String[betabet.length];
            ordered[j]= yee;
        }
        return yee;
    }
/*
alpha= "abcde"
beta= "bcdae"
int k = 0
yee= ""
for (j){
    for(i){
        if beta[j]=alpha[i]{
            k=i
            yee=yee+beta[j]
            break
            }
        }
    }
return yee
*/


    public static void main(String[] args) {
        String s = "azcbobobegghakl";
        testt(s);
        System.out.println(testt(s));

        String[] myArray= new String[10];
        myArray[0] = "Hello";
        System.out.println(myArray[0]);
    }
}
