
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Test class of InventoryTest
 * Unit tests of the Inventory class
 * @author Marion
 * @version 22/11/16
 */
public class InventoryTest {
    private Inventory inv1;
    private Weapon myWeapon;
    private Armor myArmor;
    /**
     * Constructor for the InventoryTest class
     */
    public InventoryTest()
    {
    }
    
    @Before
    public void setUp() 
    {
        myWeapon = new Weapon("axe",5,4,null);
        myArmor = new Armor("head",6,5,null);
        inv1 = new Inventory(2);
        
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Method testSetSize
     * Test if the size is correctly set in the attribute when using a setter on it
     */
    @Test
    public void testSetSize() 
    {
     inv1.setSize(5);
     assertEquals(5, inv1.getSize());
    }
    /**
     * Method testGetSize
     * Checks if the size given in the inventory constructor is correctly set to the size attribute
     */
    @Test
    public void testGetSize() 
    {
     assertEquals(2, inv1.getSize());
    } 
    
    /**
     * Method testAddObject
     * Check it correctly add an item to the inventory
     */
    @Test
    public void testAddObject(){
        inv1.addObject(myArmor);
        assertEquals(1,inv1.getLength());
        inv1.addObject(myWeapon);
        assertEquals(2,inv1.getLength());
        
    }
           
    /**
     * Method testDeleteObject
     * Check it correctly delete an item from the inventory
     */
    @Test
    public void testDeleteObject(){
        inv1.addObject(myWeapon);
        assertEquals(1,inv1.getLength());
        inv1.deleteObject(myWeapon);
        assertEquals(0,inv1.getLength());
        
    }
    /**
     * Method testCheckInv
     * Test if the Item is in the inventory or not
     */
    @Test
    public void testCheckInv(){
        //Assuming myWeapon is not in the inventory
        assertEquals(false,inv1.checkInv(myWeapon));
        //Adding myWeapon and assuming addObject method is functionnal
        inv1.addObject(myWeapon);
        //Assuming myWeapon is in the inventory
        assertEquals(true,inv1.checkInv(myWeapon));
    }
    
    /**
     * Method testGetItem
     * Test it correctly return the object in the inventory position needed
     */
    @Test
    public void testGetItem(){
        inv1.addObject(myArmor);
        //Assuming it correctly add myArmor as first inventory item
        assertEquals(myArmor,inv1.getItem(0));
        inv1.addObject(myWeapon);
        //Assuming it correctly add myWeapon as second inventory item
        assertEquals(myWeapon,inv1.getItem(1));
    }
}
