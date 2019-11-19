import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       
       String word;
       int num;
       int even = 0;
       int odd = 0;
       boolean contin = true;
       
       System.out.println("Enter a positive integer, negative to stop: ");
       num = scan.nextInt();

       while(contin)        
       {    
           while(num >= 0)
           {
               if(num % 2 == 0)
               even++;
               else if(num % 2 != 0)
               odd++;
               
               System.out.println("Enter a positive integer, negative to stop: ");
               num = scan.nextInt();
           

        }
        
           System.out.println("You have: " +even + " evens and " + odd + " odds.");
        
           scan.nextLine();
           
           System.out.println("Do you want to start over? Y or N: ");
           word = scan.nextLine();
            
           if(word.equalsIgnoreCase("Y"))
           {
               contin = true;
               
               even = 0;
               odd = 0;
               
               System.out.println("Enter a positive integer, negative to stop: ");
               num = scan.nextInt();
            }
               
           else if(word.equalsIgnoreCase("N"))
               contin = false;
               
            }
               
    }

}
