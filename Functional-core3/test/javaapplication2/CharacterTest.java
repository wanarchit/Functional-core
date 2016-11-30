package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The test class CharacterTest.
 * Unit tests of the Character class
 * 
 * @author Paul
 * @version 22/11/2016
 */
public class CharacterTest {
    
    private Character myCharacter;
    private Weapon myWeapon;
    private Armor myArmor;
    //private Inventory myInventory;
    
    /**
     * Default constructor for test class CharacterTest
     */
    public CharacterTest(){
    }
    
    /**
     * 
     */
    @Before
    public void setUp()
    {
        // str = 3 et def = 4
        myCharacter = new Character("Toto",3,4,50,10, null,null,null);
        myWeapon = new Weapon("axe",5,4,null);
        // weapon : bonusStr = 4
        myArmor = new Armor("head",6,5,null);
        // armor : nonusDef = 5
        myCharacter.getInventory().addObject(myWeapon);
        myCharacter.getInventory().addObject(myArmor);
    }
    
    /**
     * 
     */
    @After
    public void tearDown(){
        //
    }
    
    /**
     * Method testNameToto
     * Checks if the name given as parameter in the constructor is correctly set to the attribute
     */
    @Test
    public void testNameToto(){
        // The parameter "Toto" must be set as the name attribute
        assertEquals("Toto",myCharacter.getName());
    }
    
    /**
     * Method testDefaultName
     * Checks that the default name is "Tata", if the given name is empty
     */
    @Test
    public void testDefaultName(){
        Character bad = new Character("",3,4,50,10, null,null,null);
        assertEquals("WoZChar", bad.getName());
    }
    
    /**
     * Method testHealthNeg
     * Checks if the loosing of HP cannot be under 0 value
     */
    @Test
    public void testHealthNeg(){
        // The parameter HP can not be negative, it initialized at 100
        // So if charcter loose 110 HP, HP has to be at 0 and not -10 (negative)
        myCharacter.loseHP(-110);
        assertEquals(0,myCharacter.getHP());
    }
    
    /**
     * Method testHealth100
     * Checks if the adding HP cannot be superior to 100
     */
    @Test
    public void testHealth100(){
        // The parameter HP can not be negative, it initialized at 100
        // So if charcter gain 10 HP, HP has to be at 1000 and not 110
        myCharacter.gainHP(10);
        assertEquals(100,myCharacter.getHP());
    }
    
        
    /**
     * Method testStrength
     * Check if value returned by method getStrenght return the good value
     */
    @Test
    public void testGetStrength(){
        assertEquals(3,myCharacter.getStrength());
    }
    
    /**
     * Method testDefense
     * Check if value returned by method getDefense return the good value
     */
    @Test
    public void testGetDefense(){
        assertEquals(4,myCharacter.getDefense());
    }
    
    /**
     * Method testMoney
     * Check if value returned by method getMoney return the good value
     */
    @Test
    public void testGetMoney(){
        // here, Money is initialized at 50
        assertEquals(50,myCharacter.getMoney());
    }
    
    /**
     * Method testSetMoney
     * Checks if setter works well
     */
    @Test
    public void testSetMoney(){
        // Money is initialized at 50 so if setter works well, value has to change at 80.
        myCharacter.setMoney(80);
        assertEquals(80,myCharacter.getMoney());
    }
    
    /**
     * Method testSetMoney2
     * Checks if loose of money cannot be negative, minimum is 0
     */
    @Test
    public void testSetMoney2(){
        // Money is initialized at 50 so if character loose 100 the newvalue must be 0 and not -50.
        myCharacter.setMoney(-100);
        assertEquals(0,myCharacter.getMoney());
    }
    
    /**
     * Method testGetArmor
     * Checks if armor null is possible 
     */
    @Test
    public void testGetArmor(){
        assertEquals(null,myCharacter.getArmorEquipped());
    }
    
    /**
     * Method testGetWeapon
     * Checks if weapon null is possible
     */
    @Test
    public void testGetWeapon(){
        assertEquals(null,myCharacter.getWeaponEquipped());
    }
    
    /**
     * Method testSetArmor
     * Checks if armor is well change, the first value is "null"
     * The value has to change to "myArmor"
     */
    @Test
    public void testSetArmor(){
        myCharacter.setArmorEquipped(myArmor);
        assertEquals(myArmor,myCharacter.getArmorEquipped());
    }
    
    /**
     * Method testSetWeapon
     * Checks if weapon is well change, the first value is "null"
     * The value has to change to "myWeapon"
     */
    @Test
    public void testSetWeapon(){
        myCharacter.setWeaponEquipped(myWeapon);
        assertEquals(myWeapon,myCharacter.getWeaponEquipped());
    }
    
    /**
     * Method testGetTotalStr
     * Checks if value that return by method is good value
     * The amount of both parameters (base str + damage weapon) = 7
     */
    @Test
    public void testGetTotalStr(){
        myCharacter.setWeaponEquipped(myWeapon);
        assertEquals(7,myCharacter.getTotalStr());
    }
    
    /**
     * Method testGetTotalDef
     * Checks if value that return by method is good value
     * The amount of both parameters (base def + defense armor) = 7
     */
    @Test
    public void testGetTotalDef(){
        myCharacter.setArmorEquipped(myArmor);
        assertEquals(9,myCharacter.getTotalDef());
    }
}
