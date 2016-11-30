package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * The test class NPC
 * Unit tests of the NPC class
 * @author Marin Conrady
 * @version 22/11/2016
 */

public class NPCTest {
    
    private NPC myNPC;
    private Weapon wea;
    private Armor amo;
    
     /**
     * Default constructor for test class NPCTest
     */
    public NPCTest() 
    {
        myNPC= new NPC ("toto",3,3,3,3,wea,amo,true,"");
    }
    
    @BeforeClass
    public static void setUpClass() 
    {

    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Method testGetSpeech()
     * Test the default value of attribute speech
     * should be equals to " " 
     */
    @Test
    public void testGetSpeech() 
    {
        //Assuming the default speech value beig empty (equals to " " )
        assertEquals("",myNPC.getSpeech());
    }
    
    /**
     * Method testSetSpeech
     * Check if the setSpeech method correctly set the needed speech
     */
    @Test
    public void testSetSpeech()
    {
        myNPC.setSpeech("test");
        assertEquals("test",myNPC.getSpeech());
    }

    /**
     * Test isHostile method, of class NPC.
     * Should return the default value
     */
    @Test
    public void testIsHostile() 
    {
     // Assuming the default value is true
        assertEquals(true,myNPC.isHostile());
    }

    /**
     * Test of setHostile method, of class NPC.
     */
    @Test
    public void testSetHostile() 
    {
        //Default value should be set on true
        myNPC.setHostile(false);
        //Now value should be on false
        assertEquals(false,myNPC.isHostile());
    }
    
}
