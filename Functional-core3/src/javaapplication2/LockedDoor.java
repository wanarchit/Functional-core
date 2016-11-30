package javaapplication2;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Babujhi, Jonathan
 * 
 * This class allowed to have a Locked Door in a Room. 
 * The Locked door could be open thanks to a key. 
 */


public class LockedDoor extends Door {
    
    private final Key key;
    private final String name;

     
    
    /**
    * This constructor allowed the creation of a Locked Door
     * @param open
     * @param actual
     * @param next
     * @param doorName
     * @param keyName
     * @param keyPrice
     * @param pict
    */   
    
    public LockedDoor(boolean open, Room actual, Room next, String doorName, String keyName, int keyPrice, Icon pict){
        
        super(open,actual,next);
        name = doorName;
        key = new Key (keyName, keyPrice, this, pict);

        
    }

    

    /**
     * @param keyInserted
    * @return a boolean 
    * This method allowed to check if the Key of the player can open a locked door
    *  If key and the door as the same name, the method open the lockedDoor.
    */
    
    public boolean checkKey(Key keyInserted){
        return key==keyInserted;
    }
    
    /**
     *
     * @return
     */
    public Key getKey(){
    
        return key;
    }
    
    public String getName(){
       return name;
    }
    
    

}

