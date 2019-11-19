import java.util.Scanner; 

public class ReadIn
{
    public static void main(String[] ard)
    {
        String street, city, movie ; 
        int number;    
        int favnum;
        double years;   
        double math; 
        
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
        
        System.out.println("What is your favorite movie: ");
        movie = scan.nextLine();
        
        System.out.println("What is 1.5 plus 2: ");
        math = scan.nextDouble();
        
        System.out.println("What is your favorite number: ");
        favnum = scan.nextInt();
       
        System.out.println("Your address is " +number + " " +street);
        System.out.println("You've lived there " +years + "years"); 
        System.out.println("Your city is " + city);
        System.out.println("Your favorite number is "+ favnum);
        System.out.println("Your favorite movie is " +movie);
        System.out.println("1.5 plus 2 is " +math); 
        
    }
}
        
       