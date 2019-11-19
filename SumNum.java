import java.util.Scanner;

public class SumNum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
    
        int sum = 0;
        int count = 0;
        int num ;
    
        System.out.println("Enter the last number in your sum: ");
        num = scan.nextInt();
    
        while (count <= num) 
        {  
            sum = sum + count;
            count++;
            
            if(count < num)
            System.out.print(count + " + ");
            else if(count == num)
            System.out.print(count + " = ");
            
        }
    
    System.out.println(sum);
    
    }
}