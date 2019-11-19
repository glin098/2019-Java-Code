/*
 * This demonstrats the use of Logical AND operator
 * and the Logical OR operator
 * 
 *          && means AND
 *          || means OR
 *          ! means NOT
 *          
 */

import java.util.Scanner;

public class CanDrive
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int age, tickets;
        final int DRIVING_AGE = 16;
        
        System.out.println("What is your age? ");
        age = s.nextInt();
        
        if (age < 0 || age > 150)    // error trap
        {
            System.out.println("That is not possible");
        }
        else
        {
            System.out.println("How many tickets do you have? ");
            tickets = s.nextInt();
        
            if (age >= 90)
            {
                System.out.println("You need to be tested again.");
            }
            else if(age >= DRIVING_AGE && tickets > 3)
                System.out.println("You can drive but you need to slow down");
            else if (age >= DRIVING_AGE && tickets <= 3)
                System.out.println("Congrats on a clean driving record.");
            else 
                System.out.println("You can't drive yet. You must wait "
                    + (DRIVING_AGE - age) + "years.");
                    
            if(age != DRIVING_AGE)
                System.out.println("\nThis is NOT the first year you " + "are eligible to drive.");
            }
            
        }
    
}