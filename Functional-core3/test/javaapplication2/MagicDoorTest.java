/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class MagicDoorTest {
    private MagicDoor md;
    private Room r1;
    private Room r2;
    
    public MagicDoorTest() {
    }
    
    
    @Before
    public void setUp() {
        r1 = new Room ("kitchen", false, null);
        r2 = new Room ("bedroom", false, null);
        md = new MagicDoor("magicD","password", false, r1, r2, null);
    }
    
    @After
    public void tearDown() {
        r1 = null;
        r2 = null;
        md = null;
        
    }

    
    
    /**
     * Test of resolve method, of class MagicDoor.
     * This test allowed check if the method send a boolean true if 
     * the password enter by the user is similar to the password of the magic 
     * door.  If the boolean is on false password are not similar.
     */
    
    @Test
    public void testResolve() {
        System.out.println("resolve");
        String pwd = "";
        assertEquals(false, md.resolve(pwd));
    }
    
}
