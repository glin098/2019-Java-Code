public class PetDriver
{
    public static void main (String[] args)
    {
        // Calling no args constructor
        Pet p1 = new Pet();
        p1.printStats();
        
        // making pet using one argument constructor
        Pet p2 = new Pet("Lucy");
        p2.printStats();
        
        // calling 2 argument ocnstructor
        Pet p3 = new Pet("Oliver", 3);
        p3.printStats();

    }
}
