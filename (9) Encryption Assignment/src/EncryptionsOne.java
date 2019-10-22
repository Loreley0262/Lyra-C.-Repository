import java.util.Scanner;

public class EncryptionsOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //this is encryption
        System.out.println("Enter the word you want to encrypt with the simple cipher. Only one word please!");
        String wordOne = scan.next();
        String letter = wordOne.substring(wordOne.length()-1);
        String encrypted = letter + wordOne + "\bay";
        System.out.println("The encrypted word is:  " + encrypted);

        //decryption
        System.out.println("Enter the word you want to decrypt from the simple cipher. Only one word please!");
        String wordTwo = scan.next();
        String decrypt = wordTwo.substring(1, wordTwo.length()-2);
        String decrypted = decrypt + wordTwo.substring(0,1);
        System.out.println(decrypted);

    }
}
