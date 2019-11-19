//********************************************************************
//  CountFlips.java       Author: Lewis/Loftus/Cocking (modified slightly)
////  Demonstrates the use of a programmer-defined class.
//********************************************************************

import java.util.Scanner;public class CountFlips
{   
    //-----------------------------------------------------------------   
    //  Flips a coin multiple times and counts the number of heads   
    //  and tails that result.   
    //-----------------------------------------------------------------   
    
    public static void main (String[] args)   
    {  
        int numFlips;  
        int heads = 0, tails = 0;  
        
        Scanner scan =  new Scanner(System.in);  
        
        System.out.println("How many flips? ");    // try 1000      
        numFlips = scan.nextInt();      
        
        // Instantiates a Coin object, myCoin, by calling constructor in Coin class      
        // Constructor in Coin class flips it and gives it the inital value (0 or 1)      
        
        Coin myCoin = new Coin();      
        for (int count=1; count <= numFlips; count++)      
        {         
            myCoin.flip();       // flip it again         
            
            if (myCoin.isHeads())            
                heads++;         
            else            
                tails++;      
        }      
        
        System.out.println ("The number flips: " + numFlips);      
        System.out.println ("The number of heads: " + heads);      
        System.out.println ("The number of tails: " + tails);   
    }
}
    