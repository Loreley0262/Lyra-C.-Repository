import java.util.Date;

public class sandbox {

    public static void main(String[] args) {
        Date date= new java.util.Date();
        System.out.println(date);

        Customer bob = new Customer();

        System.out.println(bob.deposit(5, date, "checking"));
    }
}
