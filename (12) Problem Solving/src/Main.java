import java.util.Scanner;
/* s = lowercase characters
      1:
        find # o/vowels in s
            vowels= a,e,i,o,u
        if s = 'azcbobobegghakl',sout:
            Number of vowels: 5
      2:
        sout how many times "bob appears in s
        if s = 'azcbobobegghakl', sout:
            Number of times bob occurs is: 2
      3:
        sout longest substring of s where it's in alphabetical order
        if s = 'azcbobobegghakl', sout:
            Longest substring in alphabetical order is: beggh
        sout first substringif tied
        s = 'abcbcd', sout
            Longest substring in alphabetical order is: abc

        String name = "Patrick Stewart";
        String lastName = name.substring(8,15);
     */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        problemOne("azcbobobegghakl");

    }

    static int myMethod(int x) {
        return 5 + x;
    }

    static int problemOne(String s){
        int answer = 0;
        char[] one = new char[s.length()];
        for (int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
        return answer;
    }
    static int problemTwo(String s){
        int answer = 0;
        //your code here
        return answer;
    }
    static String problemThree(String s){
        //your code here
        return s;
    }

    /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */

}