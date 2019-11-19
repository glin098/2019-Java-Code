import java.util.Scanner;
import java.util.Random;

public class Guess
{
    public static void main(String[] args)
    {
        int num1, num2;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        System.out.println("Enter a number between 1-10: ");
        num1 = scan.nextInt();
        
        if(num1 < 1) 
            System.out.println("Invalid Entry");
        else if (num1 > 10)
            System.out.println("Invalid Entry");
        
        num2 = generator.nextInt(10) + 1;
        System.out.println("Random number between 1 to 10: " + num2);
        
        if(num1 == num2)
            System.out.println("Congrats! You guessed the correct number");
        else if(num1 != num2)
            System.out.println("Sorry, you did not guess the correct number");
           
    }
}