/*
 * This class allows the test of all functions presents on the Weapon class 
 * @Marion & Clément
 * version 22/11/2016
*/
package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WeaponTest {
    //Theses declarations will allow the creation of object only created to test functions
    private Weapon weapon;//creation of a new weapon
    
    public WeaponTest() 
    {
    }
    
    @Before
    public void setUp() 
    {
        weapon = new Weapon ("name1", 5, 5,null);
    }
    
    @After
    public void tearDown()
     // At the end of tests, inv1 and weapon take a null value
    {
        weapon = null;
    }

    //test allows to check the getDamage method in the Weapon class
    @Test
    public void testGetDamage() 
    {
      assertEquals(5,weapon.getDamage());//check if the damage value obtained by the method is similar to the value enter by the user
    }
    
}
