import java.util.Comparator;

public class tst {
    public static void main(String[] args) {
        String a = "hoi";
        String b = "hello";
        Comparator<String> strlenComp = int.compare(a.length(), b.length());
        System.out.println(strlenComp);

       // Comparator<String> strlenComp = (a, b) -> Integer.compare(a.length(), b.length());
    }
}
