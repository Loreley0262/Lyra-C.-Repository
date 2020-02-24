import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    //Default Customer constructor
    Customer(){
        name = "Bob";
        accountNumber = 1;
        checkBalance = 10;
        savingBalance = 10;
    }

    //Customer constructor
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
    }

    //Requires: integer amount, date, account
    //Modifies: checkBalance, savingBalance, deposit intset
    //Effects: adds amt to balance, stores deposit details in deposit intset
    public double deposit(double amt, Date date, String account){
        deposits.add(new Deposit(amt, date, account));

        if (account.equals(CHECKING)){
            checkBalance = checkBalance+amt;
            return checkBalance;
        }
        else if (account.equals(SAVING)){
            savingBalance = savingBalance+amt;
            return savingBalance;
        }
        else{
            return 1234;
        }
    }

    //Requires: integer amount, date, account
    //Modifies: checkBalance, savingBalance, withdraw intset
    //Effects: subtracts amt to balance, stores withdraw details in withdraw intset
    public double withdraw(double amt, Date date, String account){
        if (account.equals(CHECKING)){
            if (checkOverdraft(amt, CHECKING)){
                checkBalance = checkBalance-amt;
                return checkBalance;
            }
        }
        else if (account.equals(SAVING)){
            if (checkOverdraft(amt, SAVING)){
                savingBalance = savingBalance-amt;
                return savingBalance;
            }
        }

            return 1234;
    }

    //Requires: integer amount, date, account
    //Effects: if amt-balance is greater than -100, true. else, false.
    private boolean checkOverdraft(double amt, String account){
        if (account.equals(CHECKING)){
            return checkBalance-amt>=OVERDRAFT;
        }
        else if (account.equals(SAVING)){
            return savingBalance-amt>=OVERDRAFT;
        }
        else{
            return true;
        }
    }



    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
