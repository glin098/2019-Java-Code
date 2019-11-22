// use for bank menu

public class Dog

{
    private String name;   // instance variables or fields
    private int age;
    
    public Dog(String inName, int inAge)     // constructor
    
    {
        name = inName;age = inAge;
    }
    
    public String getName()       // accessor method
    {
        return name;
    }
    
    public int getAge()           // accessor method
    {
        return age;
    }
    
    public void setName(String inName)      // modifier method
    {
        name = inName;
    }
    
    public int calcPeopleYears()        // method
    {
        int peopleYrs = age * 7;    // local variable
        
        return peopleYrs;
        
    }
    
    
    
    
    
    
    
}


