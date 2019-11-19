/*
 * The Scanner class is in the Java library (API).
 * YOu can use the Scanner class to read informtion from
 * the keyboard (or a file) 
 */

import java.util.Scanner; 

public class ScannerProject
{
    public static void main(String[] ard)
    {
        // Declare variables
        String street, city ; 
        int number;     // no decimals
        double years;   // can have decimals
        
        Scanner scan = new Scanner(System.in);  // Make scanner object
        // scan is just a name for your Scanner - it could be different
        
        //prompt user
        System.out.println("Enter Street Name: ");
        
        // read information from keyboard and put into variable
        street = scan.nextLine();
        
        System.out.println("Enter Street Number: ");
        number = scan.nextInt();
        
        System.out.println("Enter years in residence: "); 
        years = scan.nextDouble();
        
        // If you want to read in a Stirng after a number, you need this
        scan.nextLine();    //consumes newline left-over
        
        System.out.println("Enter city: ");
        city = scan.nextLine();
        
        System.out.println("Your address is " +number + " " +street);
        System.out.println("You've lived there " +years + "years"); 
        System.out.println("Your city is " + city);
        
        
        
        
        
        
    }
}