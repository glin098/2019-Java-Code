// Modulus % (or remainder operator) should be used with integers 

import java.util.Scanner;

public class AgeConverter
{
    public static void main(String[] args)
    {
        int AgeInMonths;
        int yr, remainMonths;
        
        Scanner scan = new Scanner(System.in);
        
        final int IN_YEARS = 12;             
        
        System.out.println("Enter age in months: ");
        AgeInMonths = scan.nextInt();
         
        yr = AgeInMonths / IN_YEARS;        
        
        remainMonths = AgeInMonths % IN_YEARS;
        
        System.out.println("You are: " + yr + " years and "
            + remainMonths + " months.");
       
    }
    
}