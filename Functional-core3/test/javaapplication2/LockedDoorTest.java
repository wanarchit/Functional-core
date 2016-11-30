/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.RenderingHints.Key;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan, Babujhi
 */
public class LockedDoorTest {
    
        private Key myKey;  //
        private Door mydoor;    //
        private LockedDoor ld;
        private Room r1;
        private Room r2;
        private boolean check;
        
        
        
    public LockedDoorTest() {
    }
    
    
    @Before
    public void setUp() {
        r1 = new Room ("bedroom", false, null);
        r2 = new Room ("Kitchen", true, null);
        ld = new LockedDoor (false, r1, r2, "DoorBedroom","key1",50, null, null);
      //  ld1 = new LockedDoor(false, r1, r2, "DoorGarden","key2",50);
        //myKey = new Key("FirstKey", 3,ld);
    }
    
    @After
    public void tearDown() {
    }
        
    

    /**
     * Test of checkKey method, of class LockedDoor.
     * The test allows to check if the method checkKey work well
     * In this test we look if the name of the key and the name of the door are similar.
     */  
    
    @Test
    public void testcheckKey(){   
        assertEquals(true, ld.checkKey(ld.getKey()));
    }
}

