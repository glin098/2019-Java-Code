import java.util.Scanner;
public class PrintChar
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int times;
        int count;
        char letter;
        
        System.out.println("Enter a character: ");
        letter = scan.nextLine().charAt(0);
        
        System.out.println("How many times should it print?");
        times = scan.nextInt();
        
        while(times <= 1)
        {
            System.out.println("Number must be positive");
            
            System.out.println("How many times should it print?");
            times = scan.nextInt();
            
        }
        
        for(count = 1; count <= times; count++)
        {
            System.out.print(letter + " ");
            
        }
        
        System.out.println("\nYou asked to print " + letter + " " + times + " times.");
        
    }
}
