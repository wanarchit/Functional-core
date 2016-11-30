/*
 * This class allows the test of all functions presents on the Consummable class 
 * @Marion & Clément
 * version 22/11/2016
*/
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConsummableTest {
    //Theses declarations will allow the creation of object only created to test functions
    private Consummable consummable,consummable2;// creation of new consummables
    private Character charact;
    
    public ConsummableTest(){}
        
    
  
    @Before
    public void setUp() 
    {
        charact = new Character("toto",5,5,7,4,null,null,null);
        consummable = new Consummable ("potion",5,5,null);
        consummable2 = new Consummable ("poison",5,-10,null);
        charact.getInventory().addObject(consummable);
        charact.getInventory().addObject(consummable2);
        
    }
    
    @After // At the end of tests, inv1 and consummable take a null value
    public void tearDown(){}

    /**
     * Method testUse
     * test allows to check the use method in the Consummable class
     */
    @Test
    public void testUse() {
        charact.loseHP(-40);
        assertEquals(60, charact.getHP());
        consummable.use(charact); // +5 HP
        assertEquals(65, charact.getHP());
        consummable2.use(charact); // -10 HP
        assertEquals(55, charact.getHP());
    }

    /**
     * Method testGetBonus()
     * test allows to check the getBonus method in the Consummable class
     * check if the bonus value obtained by the method is similar to the value enter by the user
     */
    @Test
    public void testGetBonus() {
       assertEquals(5, consummable.getBonus());
    }
    
    
    
}
