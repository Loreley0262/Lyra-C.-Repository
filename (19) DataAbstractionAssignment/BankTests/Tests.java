import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Tests {
    Customer test;
    Date date= new Date(2020-1900, 1,29);
    @Before
    public void setUp(){
        test = new Customer();
    }

    @Test
    public void testDepositToString(){
        test.deposit(50, date, "Saving");
        assertEquals("Deposit of: 50.0 Date: Sat Feb 29 00:00:00 PST 2020 into account: Saving", new Deposit(50, date, Customer.SAVING).toString());
    }

    @Test
    public void testWithdrawToString(){
        test.withdraw(50, date, "Saving");
        assertEquals("Withdrawal of: 50.0 Date: Sat Feb 29 00:00:00 PST 2020 from account: Saving", new Withdraw(50, date, Customer.SAVING).toString());
    }

    @Test
    public void testDeposit(){
        assertEquals(5.0 , test.deposit(5, date, Customer.CHECKING));
        assertEquals(5.0 , test.deposit(5, date, Customer.SAVING));
        assertEquals(10.0 , test.deposit(5, date, Customer.CHECKING));
    }


    @Test
    public void testWithdraw(){
        assertEquals(-100.0, test.withdraw(100, date, Customer.CHECKING));
        assertEquals(-100.0 , test.withdraw(5, date, Customer.CHECKING));

    }
}
