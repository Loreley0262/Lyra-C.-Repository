public class Main {
//    String name = "Patrick Stewart";
//    String lastName = name.substring(8,15);
//    System.out.println(lastName);
    static int problemOne(String s){
        int answer = 0;
        for (int i=0; i<s.length(); i++){
            String vowel = s.substring(i,i+1);
            if (vowel.equals("a")||vowel.equals("e")||vowel.equals("i")||vowel.equals("o")||vowel.equals("u")){
                answer++;
            }
        }
        return answer;
    }
    static int problemTwo(String s){
        int answer = 0;
        for (int i=0; i<s.length()-3; i++){
            String amIBob = s.substring(i,i+3);
            if (amIBob.equals("bob")){
                answer++;
            }
        }
        return answer;
    }

static String problemThree (String s) {           //azcbobobegghakl
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] betabet = "accbcde".toCharArray();
    String se = "";
    String ss = "";
    boolean tOrF = false;
    for (int j = 0; j<betabet.length; j++) {
        for (int i=0;i<alphabet.length; i++) {
            if ((betabet[j] == alphabet[i] && i>=j)||(ss.equals(""))) {
                ss = ss + betabet[j];
                break;
            }
            else if (betabet[j] == alphabet[i] && i<=j){
                tOrF = true;
                break;
            }
        }

        if(tOrF){
            if (ss.length()>=se.length()){
                se=ss;
                ss="";
                tOrF = false;
                j--;
            }
        }

    }

    return se;
}

//if (ss.length()>=se.length())     ----------




/*
beta=ababc
j=0;++
i=0;++
betaj==alphai&&i>=j
a==a&&0>=0
    ___=___+a
b==b&&1>=1
    ab
a==c&&2>=2
    restart but with beta1 not beta0

 */
/*
for j
   compare jst beta to jst alpha
   if before
    start new yee
   j++

compare strlens of yee
sout yee w/longest strlen
*/


    /*

    */




    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "azcbobobegghakl";
        problemOne(s);
        problemTwo(s);
        problemThree(s);
        System.out.println("Number of vowels: " + problemOne(s));
        System.out.println("Number of times bob occurs is: " + problemTwo(s));
        System.out.println("Longest substring in alphabetical order is: " + problemThree(s));

    }
}
