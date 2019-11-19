import java.util.Scanner;

public class WhileLoops
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Counter-Controlled While Loop: \n");
        
        int count; 
        count = 0;
        
        while(count <= 10)
        {
            System.out.println(count);
            count++;
        }
        
        System.out.println("\nFlag-Controlled While Loop: \n");
        
        boolean contin = true;
        
        int value = 100;
        
        while(contin) // (while contin == true)
        {
            System.out.println(value);
            value = value + 100;
            
            if(value >= 500)
                contin = false;
         }
            
        System.out.println("\nSentinel-Controlled While Loop: \n");
        
        int sum = 0;
        
        System.out.println("Enter a number to add to the sum (0 to quit): ");
        int num = scan.nextInt();
        
        while(num != 0)
        {
            sum = sum + num;
            
            System.out.println("Enter a number to add to the sum (0 to quit): ");
            num = scan.nextInt();
        }
        
        System.out.println("The sum is " + sum);
         
    }
}
