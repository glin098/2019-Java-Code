import java.util.Scanner;

public class LoopTransformations
{
    public static void main(String[] args)
    {
        //while loop
        int num = 3;
        
        System.out.println("Part 1 Output: \n");
        
        while(num <=7)
        {
            System.out.println(num);
            num++;
        }
        
        //for loop transformation
        System.out.print("\n");
        for(num = 3; num <= 7; num++)
        
        {
            System.out.println(num);
        }
        
        //while loop
        int x;
        
        x = 5;
        
        System.out.println("\nPart 2 Output: \n");
        
        while(x<=20)
        {
            x+=4;
            System.out.println(x);
        }

        //for loop transformation
        System.out.print("\n");
        for(x = 9; x <= 21; x = x +4 )
        {
            System.out.println(x);
        }
        
    }
    
}
        
        
        