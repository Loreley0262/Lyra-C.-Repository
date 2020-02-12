import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class IntegerSetTests {
    IntegerSet testSet;

    @Before
    public void setup(){
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere(){
        //check num is not already in set
        assertEquals(0, testSet.size());
        assertFalse(testSet.contains(3));
        //insert a num
        testSet.insert(3);

        //check num is in set
        assertEquals(1, testSet.size());
        assertTrue(testSet.contains(3));
    }

    @Test
    public void testInsertAlreadyThere(){
        testSet.insert(3);
        //check num is already in set
        assertEquals(1, testSet.size());
        assertTrue(testSet.contains(3));

        //insert a num but unsuccessfully
        testSet.insert(3);

        //check num is not in set
        assertEquals(1, testSet.size());
        assertTrue(testSet.contains(3));
    }

    @Test
    public void testRemoveNotThere(){
        //check num is not already in set
        assertEquals(0, testSet.size());
        assertFalse(testSet.contains(3));

        //del a num but unsuccessfully
        testSet.remove(3);

        //check num is not in set
        assertEquals(0, testSet.size());
        assertFalse(testSet.contains(3));

    }

    @Test
    public void testRemoveAlreadyThere(){
        //check num is already in set
        testSet.insert(3);
        assertEquals(1, testSet.size());
        assertTrue(testSet.contains(3));

        //del a num
        testSet.remove(3);

        //check num is not in set
        assertEquals(0, testSet.size());
        assertFalse(testSet.contains(3));



    }
}
