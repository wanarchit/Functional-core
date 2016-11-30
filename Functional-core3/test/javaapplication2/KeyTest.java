package javaapplication2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class KeyTest {
    private Key key;
    private LockedDoor r1;
    
     /**
     *  /**
     * Default constructor for the class KeyTest.
     * @author Marion, Clément
     */
    public KeyTest() {
    }
        
    @Before
    public void setUp() {
        key = new Key("name", 5, r1,null);
    }
    
    @After
    public void tearDown() 
    {
        key = null;
    }

    /**
     * Test if the key open the door
     */
    @Test
    public void testGetDoor() 
    {
       assertEquals(r1,key.getDoor());
    }  
    
    
    public void testcheckgetKey(){
    
        assertEquals(key.getKey(), key);
    }
}
