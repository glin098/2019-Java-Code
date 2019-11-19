/*
 * Author: Grace Lin
 * Date: September 4th, 2019
 */

import java.util.Scanner;

public class MyCalculator
{
    public static void main(String[] args)
    {
        double num1, num2, sum, product, difference;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st Number: ");
        num1 = s.nextDouble();
        
        System.out.println("Enter 2nd number: ");
        num2 = s.nextDouble();
        
        sum = num1 + num2;
        product = num1 * num2;
        difference = num1 - num2;
        
       System.out.println("The sum of " + num1 + " and " + num2 +" is " +sum); 
       System.out.println("The product of " + num1 + " and " + num2 +" is " +product);
       System.out.println("The difference of " + num1 + " and " + num2 +" is " +difference);
        
    }
}