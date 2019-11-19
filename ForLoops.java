/*This class shows  for loops
 * for(initialize; condition; increment)
 {
     stuff to repeat goes inside brackets
    }
*/

import java.util.Scanner;

public class ForLoops
{
    public static void main(String[] args)
    {    
        Scanner scan = new Scanner(System.in);
        int count;
        
        System.out.println("Here's a forward loop");
        
        for(count = 1; count <= 10; count++)
        {
            System.out.println(count);
        }
        
        
        
        System.out.println("\nHere's a backward loop");
        
        for (count = 10; count >= 1; count--)
        {
            System.out.println(count);
        }
        
        
        System.out.println("\nStarting at 6, loop forward by 3's");
        
        for(count = 6; count <= 30; count +=3)
        {
            System.out.println(count);
        }
        
        
        System.out.println("\nNow, use a for loop to enter 6 numbers");
        System.out.println("\nAlso, determine the sum of the "
                + "numbers between 5 and 10\n"); 
            
        int num = 0;
        int sum = 0;
                
        for(int i = 1; i <= 6; i++)
        {
            System.out.println("Enter number " +i);
            num = scan.nextInt();
            
            if(num >= 5 && num <= 10)
                sum = sum +num;
        }
        
                
            System.out.println("The sum of # between 5 and 10 is: " + sum);  
            

            
            System.out.println("\nUse a for loop to check for 'E' or 'e' in \"Greetings Earthlings\"");        String s = "Greetings Earthlings";
            
            for(int index = 0; index < s.length(); index++)
            {
                if(s.charAt(index) == 'E' || s.charAt(index) == 'e')
                    System.out.println("I found 'E' or 'e' at position " + index);
                    
            }
            
            
        }
}
