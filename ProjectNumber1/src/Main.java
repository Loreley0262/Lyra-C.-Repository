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
    char[] betabet = s.toCharArray();
    String se = "";
    String ss = "";
    boolean tOrF = false;
    for (int j = 0; j < betabet.length; j++) {
        for (int i = 0; i < 2; i++) {
            if (ss.equals("")) {
                ss = ss + betabet[j];
                break;
            } else if (betabet[j] >= betabet[j - 1]) {
                ss = ss + betabet[j];
                break;
            } else {
                if (ss.length() > se.length()) {
                    se = ss;
                }
                ss = "";
            }
        }
    }
    if (ss.length() > se.length()) {
        se = ss;
    }
    return se;
}






/*
beta=3 (j)
alpha=2 (i)

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
        String s = "tunivklq";
        System.out.println("Number of vowels: " + problemOne(s));
        System.out.println("Number of times bob occurs is: " + problemTwo(s));
        System.out.println("Longest substring in alphabetical order is: " + problemThree(s));

    }
}
