import java.util.Scanner;

public class MenuArray
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int elements;
        boolean contin = true;
        
        System.out.print("Enter the number of elements in the array: \n");
        elements = scan.nextInt();
        
        int[] a = new int[elements]; 
        
        if(elements < 0)
            System.out.println("Number must be greater than zero.");
        
        
        int count; 
        
        for(count = 0; count < elements; count++)
        {
            System.out.println("Bucket " + count + ": ");
            a[count] = scan.nextInt();
        }
        
        
        while(contin)
        {
            System.out.println("\nChoose one of the following: ");
            System.out.println("1. Sum \n2. Average \n3. Print list forwards");
            System.out.println("4. Print list backwards \n5. Count even numbers");
            System.out.println("6. Count odd numbers \n7. Quit");
            
            int choice = scan.nextInt();
            scan.nextLine();
           
            if(choice == 1) // sum
            {
                int sum = 0;
                
                for(int i = 0; i < a.length; i++) 
                {
                    sum += a[i];
                }
                
                System.out.println("\nSum: " + sum);
            }
            
            if(choice == 2) // average
            {
                double sum = 0;
                double average = 0; 
                
                for(int i = 0; i < a.length; i++)
                {
                    sum += a[i];
                    average = sum / elements;
                }
                
                System.out.println("\nAverage: " + average);
                
            } 
            
            if(choice == 3) // print list forwards
            {
                System.out.println(" ");
                
                for(int i = 0; i < a.length; i++)
                {
                    System.out.print(a[i] + " ");
                }
                
                System.out.println(" "); 
            }
            
            if(choice == 4) // print list backwards
            {
                System.out.println(" ");
                
                for(int i = a.length - 1; i >= 0; i--) 
                {
                    System.out.print(a[i] + " ");
                }
                
                System.out.println(" ");
            }
            
            if(choice == 5) // count even numbers
            {
                System.out.println(" ");

                int even = 0;

                for(int i = 0; i < a.length; i++)
                {
                    if(i % 2 == 0)
                    even++;
                }
                
                System.out.print("The number of even numbers: " + even + "\n");
                
            }
            
            if(choice == 6) // count odd numbers
            {
                System.out.println(" ");
                
                int odd = 0;
                
                for(int i = 0; i < a.length; i++)
                {
                    if(i % 2 != 0)
                    odd++;
                }
                
                System.out.print("The number of odd numbers: " + odd + "\n");
                
            }
            
            if(choice == 7) // quit
            {
                contin = false;
            }
 
        }
    }
    
}