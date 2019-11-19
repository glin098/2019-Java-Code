import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CoinJar
{
   public static void main(String[]args )
    {
        int quarters, dimes, nickels, pennies;
        double totalquart, totaldime, totalnickel, totalpen;
        double total;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of quarters: ");
        quarters = scan.nextInt();
        System.out.println("Enter the number of dimes: ");
        dimes = scan.nextInt();
        System.out.println("Enter the number of nickels: ");
        nickels = scan.nextInt();
        System.out.println("Enter the number of pennies: ");
        pennies = scan.nextInt();
        
        totalquart = quarters * .25;
        totaldime = dimes * .10;
        totalnickel = nickels * .05;
        totalpen = pennies * .01;
        
        
        total = (totalquart + totaldime + totalnickel + totalpen);
        
        NumberFormat q = NumberFormat.getCurrencyInstance();
        System.out.println("The value is: " + q.format(total));
        
        
   
    }
}
