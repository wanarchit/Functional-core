package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan, Babujhi
 */
public class RoomTest {
    private Room r;
    private Door d1, d2;
    
    public RoomTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        r = new Room("Cuisine", true);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isClear method, of class Room.
     */
    @Test
    public void testIsClear() {
        System.out.println("isClear");
        assertEquals(true, r.isClear());
    }

    /**
     * Test of getNomRoom method, of class Room.
     */
    @Test
    public void testGetNomRoom() {
        System.out.println("getNomRoom");
        assertEquals("Cuisine", r.getNameRoom());
    }

    /**
     * Test of setClear method, of class Room.
     */
    @Test
    public void testSetClear() {
        System.out.println("setClear");
        r.setClear();
        assertEquals(false, r.isClear());
        r.setClear();
        assertEquals(true, r.isClear());
    }  
    
    /** 
     * Test if there is not the same door twice in a Room
     */
    @Test
    public void testDoorTwice() {
        System.out.println("DoorTwice");
        d1 = new Door(true, r, r);
        d2 = d1;
        r.setExit("North", d1);
        r.setExit("South", d2);
        assertNotSame(r.getHashMap().get("South"), r.getHashMap().get("North"));
    }
}