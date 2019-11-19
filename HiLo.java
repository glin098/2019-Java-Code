import java.util.Scanner;
import java.util.Random;

public class HiLo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int guess = 0;
        int num1;
        int count = 0;
        
        num1 = generator.nextInt(100) +1;
        
        while (guess != num1)
        {
            System.out.println("Guess a number between 1 and 100:");
            guess = scan.nextInt();
            
            if (guess > 100)
            System.out.println("Error");
            else if (guess < 1)
            System.out.println("Error");
            else if (guess < num1)
            System.out.println("Too low.");
            else if (guess > num1)
            System.out.println("Too high.");
            else
            System.out.println("You win!");
            
            count ++;
        }
        
        System.out.println("Number of Guesses: " + count);
    
        
    }
}


