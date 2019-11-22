import java.util.Scanner;

public class DogMenu
{    
    public static void main (String[] args)    
    {        
        boolean contin = true;        
        String dName;        
        int dAge;        
        
        Scanner scan = new Scanner(System.in);  
        
        System.out.println("Dog's name?");        
        dName = scan.nextLine();        
        
        System.out.println("Dog's age?");        
        dAge = scan.nextInt();        
        
        Dog myDog = new Dog(dName, dAge); // makes a new Dog object        
        
        while(contin)        
        {            
            System.out.println("\nChoose one:\n");            
            System.out.println("1. Change the name");            
            System.out.println("2. Calculate People Years");            
            System.out.println("3. Quit");            
            
            int choice = scan.nextInt();            
            scan.nextLine();    // clear end of line
            
            if(choice == 1)
            {
                System.out.println("\nNew name? ");
                dName = scan.nextLine();
                
                myDog.setName(dName);
                System.out.println("New name: " + myDog.getName()); 
            }
            else if(choice == 2)
            {
                System.out.println("Age in people years: " + myDog.calcPeopleYears());
            }
            else if(choice == 3)
            {
                contin = false;
            }
        
        }    
    
    }
}