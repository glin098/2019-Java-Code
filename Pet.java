/*
 * This Pet class has multiple constructors. 
 * 
 * Any constructor can be called from driver 
 * when making a new pet
 * 
 * Constructors always have same name as class
 */

public class Pet
{
    private String name;
    private int age;
    
    // default, no arguements constructor
    public Pet()
    {
        name = "Fido";
        age = 0;   // default value
    }

    // one argument constructor
    public Pet(String inName)
    {
        name = inName;
        age = 0;   // default value
    }
    
    // two argument constructor
    public Pet(String inName, int inAge)
    {
        name = inName;
        age = inAge;
    }
    
    public void printStats()
    {
        System.out.println("Name: " + name + "\tAge: " + age);
        
    }
}