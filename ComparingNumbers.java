import java.util.Scanner;

public class ComparingNumbers
{
    public static void main(String[] args)
    {
        int num1, num2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number greater than or equal to zero: ");
        num1 = scan.nextInt();
        
        if(num1 == 0) //equality operator, returns a true or a false
            System.out.println("Your number s equal to 0");
            
        // can also have if with else
        
        if (num1 == 10)
        {
            System.out.println("Your number is equal to 10");
        }
        else
        {
            System.out.println("Your number is NOT equal to 10");
        }
        
        // if oyu have more than one statement after an "if" or an "else," 
        // you must enclose the statement in braces
            
        if (num1 < 0) // error trapping
            System.out.println("Invalid number");
        else
        {
            System.out.println("Enter a second number: ");
            num2 = scan.nextInt();
            
            if(num1 < num2)
                System.out.println("The smaler is " + num1);
            else if (num2 < num1)
                System.out.println("The smaller is " + num2);
            else
                 System.out.println("The numbers are equal");
         }
           
    }
}