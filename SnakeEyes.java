//********************************************************************
//  SnakeEyes.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a class with overloaded constructors.
//********************************************************************

import java.util.Scanner;

public class SnakeEyes
{   
    //-----------------------------------------------------------------   
    //  Creates two die objects, then rolls both dice a set number of   
    //  times, counting the number of snake eyes that occur.   
    //-----------------------------------------------------------------   
    
    public static void main (String[] args)   
    {      
        
        Scanner scan = new Scanner(System.in);
        
        int ROLL;  
        int GOAL;
        int snakeEyes = 0, num1, num2; 
        
        Die die1 = new Die();
        Die die2 = new Die();
        
        System.out.println("Enter a goal between 2 and 12.");
        GOAL = scan.nextInt();
        
        if(GOAL > 12 || GOAL < 2)
        {
            System.out.println("Enter a goal between 2 and 12.");
            GOAL = scan.nextInt();
        }
        
        num1 = die1.roll();
        num2 = die2.roll();
        
        ROLL = num1 + num2;
        
        System.out.println("You have rolled a " + num1 + " and a " +num2);
        
        while(ROLL > GOAL || ROLL < GOAL)
        {
            num1 = die1.roll();
            num2 = die2.roll();
            
            ROLL = num1 + num2;
            
            System.out.println("You have rolled a " + num1 + " and a " +num2);
            
            if(num1 == 1 && num2 == 1)
                System.out.println("You've rolled Snake Eyes!");
            else if(num1 == num2 && num1 != 1)
                System.out.println("You have rolled a double!");
                
         }
         
         System.out.println("\nYou matched your goal.");
 
    }
}
        