
/*
 * Combining ints and doubles
 * Author: Grace Lin
 * Date: September 4th, 2019
 */

import java.util.Scanner;

public class NumAvgAssignment
{
    public static void main(String[] args)
    {
        int num1, num2, num3;
        double average;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st Number: ");
        num1 = s.nextInt();
        
        System.out.println("Enter 2nd number: ");
        num2 = s.nextInt();
        
        System.out.println("Enter 3rd number: ");
        num3 = s.nextInt();
        
        average = (num1 + num2 +num3) / 3.0;
        
        System.out.println("The average of the three numbers " + num1 + " and " + num2 + " and " + num3 + " is: " +average); 
        
        
       
    }
}