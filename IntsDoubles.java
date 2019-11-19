/*
 * Combining ints and doubles
 */

import java.util.Scanner;

public class IntsDoubles
{
    public static void main(String[] args)
    {
        int num1, num2;
        int sum;
        double quotient;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st Number: ");
        num1 = s.nextInt();
        
        System.out.println("Enter 2nd number: ");
        num2 = s.nextInt();
        
        sum = num1 + num2;
        
   
        System.out.println("The sum of " + num1 + " and " + num2 +" is " +sum); 
        
        quotient = (double)num1 / num2;
        
        System.out.println(num1 + "/" + num2 + "  = " +quotient);
        
    }
}