import java.util.Scanner;

public class ForceChoice
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int choice;
        
        System.out.println("Pick a number between 1 and 10");
        choice = scan.nextInt();
        
        while(choice < 1 || choice > 10)
        {
            System.out.println("Invalid Number");
            System.out.println("Pick a number between 1 and 10");
            choice = scan.nextInt();
        }
        
        System.out.println("You have picked " + choice);
        
    }
}
        