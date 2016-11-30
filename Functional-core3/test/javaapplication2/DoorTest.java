package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author saspaanithy
 */
public class DoorTest {
    private Door d;
    private Room r1, r2;
    public DoorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        r1 = new Room("Cuisine", true);
        r2 = new Room("Salon", false);
        d = new Door(false, r1, r2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLocked method, of class Door.
     * This method allowed to check if the method GetLocked allowed the user to
     * get a boolean which allowed to know if the door is open or not. 
     */
    @Test
    public void testGetLocked() {
        System.out.println("getLocked");
        boolean result = d.isLocked();
        assertEquals(false, result);
    }

    /**
     * Test of setLocked method, of class Door.
     * This test allowed to check if the method SetLocked allowed to change the 
     * boolean of a door. In order to make a door close, open. 
     * 
     */
    @Test
    public void testSetLocked() {
        System.out.println("setLocked");
        d.setLocked();
        assertEquals(true, d.isLocked());
        d.setLocked();
        assertEquals(false, d.isLocked());
    }

    /**
     * Test of getNextRoom method, of class Door.
     * This test allowes to check if the method GetNextRoom give the correct room.
     */
    @Test
    public void testGetNextRoom() {
        System.out.println("getNextRoom");
        Room result = d.getNextRoom();
        assertEquals(r2, result);
    }
    

    /**
     * Test of getActualRoom method, of class Door.
     * This test allows to check if the method GetActualRoom give the good room.
     */
    @Test
    public void testGetActualRoom() {
        System.out.println("getActualRoom");
        Room result = d.getActualRoom();
        assertEquals(r1, result);
    }
    
    /**
     * Test if actual et nextRoom are not the same. Test must fail.
     */
    @Test
    public void testActualNextRoomSame() {
        System.out.println("actual and Next Room same");
        assertNotSame(d.getActualRoom(), d.getNextRoom());
    }
}