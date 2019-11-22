// use this to work on Bank program

public class MonsterDriver
{
    public static void main(String[] args)
    {
        int refAge = 21;
        
        Monster m1 = new Monster("Max", 107, false, 200);
        // has to be in the same order and the same type
        
        m1.printStats(); // public void
        
        //  m1.sayHello(); need to print it or put it in a variable
        
        System.out.println(m1.sayHello());
       
        boolean heavy = m1.isHeavy();
        System.out.println("Heavy? " + heavy);
        
        m1.grow(10.5); // add weight to monster
        m1.printStats(); // see how the weight changed
        
        System.out.println(m1.yearsOlderThan(refAge) + " years older.");
        
        
    }
}