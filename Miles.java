
// Converts length in inches to feet and inches

// Modulus % (or remainder operator) should be used with integers 

import java.util.Scanner;

public class Miles
{
    public static void main(String[] args)
    {
        double totalMiles;
        double km, remainMiles;
        
        Scanner scan = new Scanner(System.in);
        
        final double IN_PER_KM = 1.60935;               
        
        System.out.println("Enter the distance in miles: ");
        totalMiles = scan.nextDouble();
         
        km = totalMiles * IN_PER_KM;          
        
        remainMiles = totalMiles % IN_PER_KM;
        
        System.out.println("The distance in kilometers is: " + km);
     
    }
    
}