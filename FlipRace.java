//********************************************************************
//  FlipRace.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the existence of separate data space in multiple
//  instantiations of a programmer-defined class.
//********************************************************************
import java.util.Scanner;

public class FlipRace
{   
    //-----------------------------------------------------------------   
    //  Flips two coins until one of them comes up heads three times   
    //  in a row.   
    //-----------------------------------------------------------------   
    
    public static void main (String[] args)   
    {      
        Scanner scan = new Scanner(System.in);
        
        int GOAL = 0;      
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        // Create two separate coin objects      
        Coin coin1 = new Coin();      
        Coin coin2 = new Coin();
        Coin coin3 = new Coin();
        
        String user1 = " ";
        String user2 = " ";
        String user3 = " ";
        
        System.out.println("What GOAL do you want (how many in a row to win between 2 and 5)");
        GOAL = scan.nextInt();
        
        while(GOAL > 5 || GOAL < 2)
        {
            System.out.println("Your number is invalid.");
            System.out.println("What GOAL do you want (how many in a row to win between 2 and 5)");
            GOAL = scan.nextInt();
        }
        
        scan.nextLine();
        
        System.out.println("Enter a name for coin 1: ");
        user1 = scan.nextLine();
        
        System.out.println("Enter a name for coin 2: ");
        user2 = scan.nextLine();
        
        System.out.println("Enter a name for coin 3: ");
        user3 = scan.nextLine();
        
        while (count1 < GOAL && count2 < GOAL && count3 < GOAL)      
        {         
            coin1.flip();         
            coin2.flip();   
            coin3.flip();
            
            // Print the flip results (uses Coin's toString method)         
            System.out.println ("Coin 1: " + coin1 + "   Coin 2: " + coin2 + "    Coin 3: " + coin3);         
            
            // Increment or reset the counters  
            if (coin1.isHeads())            
                count1++;         
            else            
                count1 = 0;
                
            if (coin2.isHeads())            
                count2++;         
            else            
                count2 = 0;  
                
            if(coin3.isHeads())
                count3++;
            else
                count3 = 0;
         }      
         
         // Determine the winner
         if(count1 == GOAL)
            System.out.println (user1 + " Wins!");
         else if(count1 == count3 || count1 == count2 )
            System.out.println("It is a TIE.");
            
         if(count2 == GOAL)
            System.out.println (user2 + " Wins!");
         else if(count2 == count3 || count2 == count1 )
            System.out.println("It is a TIE.");
            
         if(count3 == GOAL)
            System.out.println (user3 + " Wins!");
         else if(count3 == count1 || count3 == count2 )
            System.out.println("It is a TIE.");
         
          
        }
    }
