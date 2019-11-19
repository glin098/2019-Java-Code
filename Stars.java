import java.util.Scanner;

public class Stars
{ 
   
   public static void main (String[] args)
    {
       Scanner scan = new Scanner(System.in);
       
       int columns = 0;
       int rows = 0;
       int num = 0;
       
       System.out.println("How many stars do you want (2-10): ");
       num = scan.nextInt();

       if(num > 10 || num < 2)
        {  
            System.out.println("Pick a number between 2-10: ");
            num = scan.nextInt();
        }
        
       for(rows = num; rows >= 2 && rows <= 10; rows--) 
          { 
              for (columns = num; columns >= 2 && columns <= 10; columns--)   
              {
                  System.out.print("* ");
               }
                 
                System.out.println("* ");    
          }
     
         int num2 = num;
          
         for(num2 = 1;num2 >= 1; num++) 
          { 
              {
              for (num2 = num; num <= num2; num2++)   
                  System.out.print("* ");  
                }
                System.out.println("* ");  
            }

        
            } 
            
        }
