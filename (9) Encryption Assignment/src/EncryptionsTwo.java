import java.util.Scanner;
import java.util.Arrays;

public class EncryptionsTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] basetexttt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz`1234567890-=~!@#$%^&*()_+[{]}|;:',<.>/?".toCharArray();
        char[] ciphertext = "DEFGHIJKLMNOPQRSTUVWXYZABCdefghijklmnopqrstuvwxyzabc`1234567890-=~!@#$%^&*()_+[{]}|;:',<.>/?".toCharArray();

        //variable list
        //oneWord = word that becomes decrypted
        //twoWord = word to be decrypted
        //i, j, k, num = counters for the for loop.

        //this is encryption
        System.out.println("What would you like to encrypt? Please don't add spaces, but almost anything else is fine!");
        char[] oneWord = scan.next().toCharArray();
        for (int i = 0; i < oneWord.length; i++) {
            for (int j = 0; j < basetexttt.length; j++) {
                if (oneWord[i] == basetexttt[j]) {
                    System.out.print(ciphertext[j]);
                    break;
                }
            }
        }

            //this is decryption
        System.out.println("\nWhat would you like to decrypt? Please don't add spaces, but almost anything else is fine!");
            char[] twoWord = scan.next().toCharArray();
            for (int k = 0; k < twoWord.length; k++) {
                for (int num = 0; num < ciphertext.length; num++) {
                    if (twoWord[k] == ciphertext[num]) {
                        System.out.print(basetexttt[num]);
                        break;
                    }
                }
            }

    }
}