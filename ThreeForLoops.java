import java.util.Scanner;
public class ThreeForLoops
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int count = 0;
        int pos = 0;
        String phrase = " ";
        
        System.out.println("Here's the output from loop 1: ");
        
        for(count = 10; count <= 22; count ++)
        {
            System.out.print(count + " ");
        }
        
        System.out.println("\n\nHere's the output from loop 2: ");
        
        for(count = 100; count >=20; count = count -5)
        {
            System.out.print(count + " ");
        }
        
        System.out.println("\n\nEnter a String: ");
        phrase = scan.nextLine();
        
        System.out.println("Here is the output from loop 3: ");
        
        pos = phrase.charAt(pos);
        for(pos = 1; pos < phrase.length(); pos = pos +2)
        
        {
            char c = phrase.charAt(pos);
            
            System.out.print(c + " ");
        }
        
    }
}
