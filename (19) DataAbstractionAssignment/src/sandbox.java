import java.util.Date;

public class sandbox {

    public static void main(String[] args) {
        Date date= new Date(2020-1900, 1,29);

        System.out.println(date);

        Customer bob = new Customer("bob", 0, 10.0, 20.0);
        bob.withdraw(50.0, date, "Checking");
        bob.withdraw(50.0, date, "Saving");
        bob.deposit(50.0, date, "Checking");
        bob.deposit(50.0, date, "Saving");
        bob.displayWithdraws();
        bob.displayDeposits();




    }
}

/*
* bal = -90
* wit = 20
* bal = -110
*
* 100-(bal.abs) = 10
* wit - 10 = 10
* wit = 10
*
*
* */