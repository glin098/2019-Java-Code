import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
        String strRPS = "";  
        
        int intRPS = 0;
        int compRPS;
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        System.out.println("Enter R for Rock, P for Paper, S for Scissors: ");
        
        strRPS = scan.nextLine();
        
        if(strRPS.equals("R"))
            intRPS = 1;
        else if(strRPS.equals("P"))
            intRPS = 2;
        else if(strRPS.equals("S"))
            intRPS = 3;
        
        compRPS = generator.nextInt(3) + 1;
        System.out.println("Random number between 1 to 3: " + compRPS);
          
        if(compRPS == 1)
            System.out.println("The computer has chosen Rock");
        else if(compRPS == 2)
            System.out.println("The computer has chosen Paper");
        else if(compRPS == 3)
            System.out.println("The computer has chosen Scissors");
        
        if(intRPS == compRPS)
            System.out.println("It is a tie");
        else if(intRPS == 1 && compRPS == 2)
            System.out.println("Paper beats Rock, Computer wins.");
        else if(intRPS == 1 && compRPS == 3)
            System.out.println("Rock beats Paper, User wins.");
        else if(intRPS == 2 && compRPS == 1)
            System.out.println("Paper beats Rock, User wins.");
        else if(intRPS == 2 && compRPS == 3)
            System.out.println("Scissors beats Paper, Computer wins.");
        else if(intRPS == 3 && compRPS == 1)
            System.out.println("Rock beats Scissors, Computer wins.");
        else if(intRPS == 3 && compRPS == 2)
            System.out.println("Scissors beats Paper, User wins.");
            
        
        
    }
}

