//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking  (modified slightly)
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************

public class Coin
{  
    private int face;    // 0 for Heads, 1 for tails   
    
    //-----------------------------------------------------------------   
    //  Sets up the coin by flipping it initially.   
    //-----------------------------------------------------------------   
    
    public Coin ()   
    {      
        flip();     // constructor calls flip method which initializes field face   
    }   
    
    //-----------------------------------------------------------------   
    //  Flips the coin by randomly choosing a face value.   
    //-----------------------------------------------------------------   
    
    public void flip ()   
    {      
        face = (int) (Math.random() * 2);        // randomly generates a 0 or 1   
    }   
    
    //-----------------------------------------------------------------   
    //  Returns true if the current face of the coin is heads.   
    //-----------------------------------------------------------------   
    
    public boolean isHeads ()   
    {  
        if (face == 0)         
            return true;      
        else          
            return false;   
    }   
    
    //-----------------------------------------------------------------   
    //  Returns the current face of the coin as a string.   
    //-----------------------------------------------------------------   
    
    public String toString()   
    {      
        String faceName;  // local variable 
        
        if (face == 0)         
            faceName = "Heads";      
        else         
            faceName = "Tails";      
        return faceName;
        
    }
}
    