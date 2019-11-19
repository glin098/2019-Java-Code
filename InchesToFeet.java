// Converts length in inches to feet and inches

// Modulus % (or remainder operator) should be used with integers 

import java.util.Scanner;

public class InchesToFeet
{
    public static void main(String[] args)
    {
        int totalInches;
        int ft, remainInches;
        
        Scanner scan = new Scanner(System.in);
        
        final int IN_PER_FT = 12;                // constant
        
        System.out.println("Enter length in inches: ");
        totalInches = scan.nextInt();
         
        ft = totalInches / IN_PER_FT;            //decimal dropped
        
        remainInches = totalInches % IN_PER_FT;
        
        System.out.println("The length is: " + ft + " feet and "
            + remainInches + " inches.");
       
    }
    
}