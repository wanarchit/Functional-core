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
        private LockedDoor ld1;
        private LockedDoor ld2;
        private Room r1;
        private Room r2;
        private boolean check;
        
        
        
    public LockedDoorTest() {
    }
    
    
    @Before
    public void setUp() {
        r1 = new Room ("bedroom", false);
        r2 = new Room ("garden", false);
        ld = new LockedDoor (false, r1, r2, "DoorBedroom","key1",50);
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
                
        //check = ld1.checkKey();
        //assertEquals(false, check);
    
    }
    
    /**
     * Test of getLockedDoor;
     * The test allowed to check if the method getLockedDoor work well
     * In this test we look if we get the Door boolean in order to know if the door
     * is open or not.
     */  
    
    public void testgetName(){
        assertEquals(ld.getName(), "DoorBedroom");
        
    }
    
}

