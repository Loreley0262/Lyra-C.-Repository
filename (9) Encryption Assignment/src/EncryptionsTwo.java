import java.util.Scanner;
import java.util.Arrays;

public class EncryptionsTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] basetexttt = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ciphertext = "defghijklmnopqrstuvwxyzabc".toCharArray();

        //this is encryption
        System.out.println("Enter the word you want to encrypt with the substitution cipher. Only one word please!");
        char[] oneWord = scan.next().toCharArray();
        System.out.println(oneWord);
        for (int i=0; i<oneWord.length; i++){

            for (int isIt=0; isIt<basetexttt.length; isIt++){
                int a = 0;
                if (oneWord[a] == basetexttt[isIt]){
                    System.out.print(ciphertext[isIt]);
                    a++;
                }
            }

        }

        //this is decryption
        System.out.println("Enter the word you want to decrypt with the substitution cipher. Only one word please!");
        char[] twoWord = scan.next().toCharArray();
        System.out.println(twoWord);
        for (int i=0; i<twoWord.length; i++){
            if (twoWord[i] == ciphertext[i]){
                System.out.print(basetexttt[i]);
            }
        }
    }
}

