import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Tests {
    Customer test;
    Date date = new Date();
    @Before
    public void setUp(){
        test = new Customer();
    }

    @Test
    public void testDepositToChecking(){
          test.deposit(5, date, "Checking");
          assertEquals(test.displayDeposits(), 59);
//        assertTrue(test.isPurchased(10));
//        test.purchaseSeat(10);
//        assertEquals(test.getSize(), 59);
    }

    @Test
    public void testWithdrawFromChecking(){

    }

    @Test
    public void testWithdrawFromSaving(){

    }


    @Test
    public void testDepositToSaving(){

    }
}
