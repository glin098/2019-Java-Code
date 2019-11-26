
import java.text.NumberFormat;
public class Bank
{
    public static void main (String[] args)
    {
       NumberFormat m = NumberFormat.getCurrencyInstance(); 
                          
       Account acct1 = new  Account("George","Wilson",12345, 200.00);   
       System.out.println("Account Name: " + acct1.getName());
       System.out.println("Account Number: " + acct1.getNumber());
       System.out.println("Account Balance: " + (m.format(acct1.getBalance())));

       acct1.deposit(100.00);
       System.out.println("Depositing $100...");
       System.out.println("Account Balance: " + (m.format(acct1.getBalance())));
       
       
       acct1.deposit(350.00);
       System.out.println("Depositing $350...");
       System.out.println("Account Balance: " + (m.format(acct1.getBalance())));
       
       
       acct1.withdraw(300.00);
       System.out.println("Withdrawing $300...");
       System.out.println("Account Balance: " + (m.format(acct1.getBalance())));
       
       System.out.println("Withdrawing $1000..."); 
       acct1.withdraw(1000.00);
       System.out.println("Account Balance: " + (m.format(acct1.getBalance())));
       
       System.out.println("Adding Interest..."); 
       acct1.interest();
       System.out.println("Account Balance: " + (m.format(acct1.getBalance())));

    }
}
