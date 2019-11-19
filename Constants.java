/*
 * A constant is a variable whose value cannot be changed once it is set
 * 
 * This program uses a constant for pi and calculates the area of a circle
 */

import java.util.Scanner;

public class Constants
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        final double PI = 3.14159; 
        
        double radius;
        
        System.out.println("Enter the radius: ");
        radius = scan.nextDouble();
        
        double area = PI * radius * radius;
        
        System.out.println("The area is: " + area);
    }
    
}
