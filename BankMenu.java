import java.text.NumberFormat;
import java.util.Scanner;
public class BankMenu
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
         boolean contin = true;
         String first, last = "";
         int accountNum = 0;
         double initialBal = 0;
         double howMuch;
         
         
         System.out.println("First name?");
         first = scan.nextLine();
         
         System.out.println("Last name?");
         last = scan.nextLine();
         
         System.out.println("Account number?");
         accountNum = scan.nextInt();
         
         System.out.println("Initial account balance?");
         initialBal = scan.nextInt();
         
         Account myAccount = new Account(first, last, accountNum, initialBal);
         
         while(contin)
         {
            System.out.println("\nChoose one:\n");            
            System.out.println("1. Deposit");            
            System.out.println("2. Withdraw");            
            System.out.println("3. Add interest");
            System.out.println("9. Stop processing");

            int choice = scan.nextInt();            
            scan.nextLine();
            
            if(choice == 1)
            {
                System.out.println("\nHow much to deposit?");
                howMuch = scan.nextDouble();   
                
                System.out.println("Balance: " + myAccount.deposit(0));
            }
            else if(choice == 2)
            {
                System.out.println("How much to withdraw?");
                howMuch = scan.nextDouble();
                
                System.out.println("Balance: " + myAccount.withdraw(0));
            }
            else if(choice == 3)
            {
                System.out.println("Adding interest...");
                System.out.println("Balance: " + myAccount.interest());
            }
            else if(choice == 9)
            {
                contin = false;
            }
              
         }
          
        
    }
}