import java.util.Scanner;

public class ReadColor
{
    public static void main(String[] args)
    {
        int num1, num2;
        String letter;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number 1 or 2: ");
        num1 = scan.nextInt();
        
        if(num1 == 1) 
            System.out.println("Red");
        else if(num1 == 2)
            System.out.println("Blue");
        else if(num1 > 2)
            System.out.println("Invalid number");
        else if(num1 < 1)
            System.out.println("Invalid Entry");
            
        scan.nextLine();
  
        System.out.println("Enter the letter R or B: ");
        letter = scan.nextLine();
        
        if(letter.equals("R"))
            System.out.println("Red");
        else if(letter.equals("B"))
            System.out.println("Blue");
        else 
            System.out.println("Invalid Entry");
        
         }

}