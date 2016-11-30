/*
 * This class allows the test of all functions presents on the Armor class 
 * @Marion & Clément
 * version 22/11/2016
*/
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ArmorTest {
    //Theses declarations will allow the creation of object only created to test functions
    private Armor armor;//Creation of a new armor
    private Character charact;
    
    public ArmorTest() 
    {
    }
    
    @Before
    public void setUp() {
        charact = new Character("nameChar",10,10,10,5,null,null,null);
        armor = new Armor ("name1", 5, 5,null);
        charact.getInventory().addObject(armor);
    }
    
    @After
    public void tearDown() 
    {}
    
    /**
     * Method testUse
     * test allows to check the use method in the Armor class
     */
    @Test
    public void testUse() 
    {
        assertEquals(null, charact.getArmorEquipped());        
        armor.use(charact);
        assertEquals(armor, charact.getArmorEquipped());
    }

    /**
     * Method testGetDefense
     * test allows to check the getDefense method in the Armor class
     */
    @Test
    public void testGetDefense() 
    {
        assertEquals(5, armor.getDefense());//check if the value obtained by the method is similar to the value enter by the user 
    }
    
}
