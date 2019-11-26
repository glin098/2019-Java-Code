// all money calculatons done here, not in bank!!

public class Account
{
    //fields or instance variables
    private String fname;   // first name
    private String lname;   // last name
    private int number;     // account number
    private double balance;     
    
    // constructor
    public Account(String inFN, String inLN, int inNum, double inBal)
    {
        fname = inFN;
        lname = inLN;
        number = inNum;
        balance = inBal;
    }
    
    public String getName()            // accessor method
    {
        return fname + " " + lname;
    }
    
    
        public int getNumber()        // accessor method
        
    {
            return number;
    
    }
    
    public double getBalance()         // accessor method
    {
        return balance;
        
    }
    
    public void deposit(double inDeposit)
    {
        balance = balance + inDeposit;
    }
    
    public void withdraw(double inWith)     // new method
    {
        if(inWith > balance)
            System.out.println("Insufficient funds.");
        else
            balance = balance - inWith;
    }
    
    public void interest()
    {
        //increase the balance based on the interest rate
        // for the amount of money currently in the account
        //there is no return statement
        
        if(balance <= 1000)
            balance = balance * 1.03;
        else if(balance > 1000 && balance <= 25000)
            balance = balance * 1.035;
        else if(balance > 25000)
            balance = balance * 1.0375;
    }
    
    public void penalty()
    {
        if(balance < 200)
            balance = balance - 5;
    }
      
    
    
}