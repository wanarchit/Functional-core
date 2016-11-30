/*
 * This class allows the test of all functions presents on the Chest class 
 * @Marion & Clément
 * version 22/11/2016
*/
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ChestTest {
    //Theses declarations will allow the creation of object only created to test functions
    private Chest chest; // creation of a new chest
    //private Inventory inv1;// creation of a new inventory
    
    public ChestTest() 
    {
    }
    
    @Before
    public void setUp() 
    {
        chest = new Chest("chest1", 50, 3,null);
    }
    
    @After
    public void tearDown(){ }
    
    /**
     * Method testGetMoney
     * test allows to check the getMoney method in the Chest class
     */
    @Test
    public void testGetDMoney() 
    {
        assertEquals(50, chest.getMoney());//check if the money value obtained by the method is similar to the value enter by the user
    }
    
    // other function are only getter and setter and they are already tested
      
}
