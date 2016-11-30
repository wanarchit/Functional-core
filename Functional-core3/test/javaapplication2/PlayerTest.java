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
 * @author Marin and Paul
 * @version 22/11/16
 */
public class PlayerTest {
    private Player myPlayer;
    private Room r,r2;
    public PlayerTest() 
    {
        
    }    
    
    @Before
    public void setUp() {
        myPlayer= new Player("toto",3,3,3,3,null,null,r);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getKarma method, of class Player.
     * Test that the expected result fit with the default karma value
     */
    @Test
    public void testGetKarma()
    {   
        //The default karma value being 50
        assertEquals(50,myPlayer.getKarma());
    }
    
    /**
     * Test of setKarma method of class Player
     * Test that the setter correctly set the attribute
     */
    @Test
    public void testSetKarma()
    {
        myPlayer.setKarma(20);
        assertEquals(20,myPlayer.getKarma());
    }
    
    /**
     * Test of add10Karma of class Player
     * Test the methode correctly add 10 karma to the attribute
     */
    @Test
    public void testAdd10Karma()
    {
        //Assuming the value is set to 20
        myPlayer.add10Karma();
        assertEquals(60,myPlayer.getKarma());
    }
    
    /**
     * Test del10Karma method of Player class
     * Test the method correctly delete 10 karma to the attribute
     */
    @Test
    public void testDel10Karma()
    {
        //Assuming the value is set to 30
        myPlayer.del10Karma();
        assertEquals(40,myPlayer.getKarma());
    }
    
    /**
     * Test getActualRoom method of Player class
     * Test the getter return the correct constructor value
     */
    @Test
    public void testGetActualRoom()
    {
        //Assuming the actual room is set to r
        assertEquals(r,myPlayer.getActualRoom());
    }
    
    /**
     * Test setActualRoom method of Player class
     * Test the setter correctly set the attribute value
     */
    @Test
    public void testSetActualRoom()
    {
       myPlayer.setActualRoom(r2);
       assertEquals(r2,myPlayer.getActualRoom());
    }
}
