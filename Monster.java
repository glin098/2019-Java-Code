public class Monster
{
    // fields or instance variables, should be private
    private String name;
    private int age;
    private boolean scary;
    private double weight;
    
    
    
    // constructor, initial some of the fields, public, has same name as class
    public Monster(String n,int a, boolean s, double w)
    {
        name = n;
        age = a;
        scary = s;
        weight = w;  
    }
    
    // methods, make it do stuff/do stuff to it
    
    public void printStats() // void = doesnt return ny information when its called from the driver
    {
        System.out.println("Name: " + name + "   Age: " + age);
        System.out.println("Scary?: " + scary + "   Weight: " + weight);
    }
    
    public String sayHello()
    {
        return "Roar";
    }
    
    public boolean isHeavy()
    {
        if(weight > 100) //weight is private but can access it inside its own class
            return true;
        else
            return false;
    }
    
    public void grow(double w)
    {
        weight = weight + w;
    }
    
    public int yearsOlderThan(int yrs)
    {
        int ageDiff = age - yrs; // local variable, destroyed when method leaves
        return ageDiff;
    }
    
}