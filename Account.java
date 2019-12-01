public class Account
{
    private String fname, lname;
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
    
    public void deposit(double amt)
    {
        balance += amt;
    }
    
    public void withdraw(double amt)     // new method
    {
        if(amt > balance)
            System.out.println("Insufficient funds.");
        else
            balance -= amt;
    }
    
    public double interest() 
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
            
            return balance;
    }
    
    public void penalty() //same as above
    {
        if(balance < 200)
            balance = balance - 5;
    }
      
    
    
}