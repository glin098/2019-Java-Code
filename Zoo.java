/* 
 * This is the client (or driver) class which constructs 
 * individual objects of type Animal (by calling a constructor in 
 * the Animal class.) 
 *  
 * After an individual object has been created, it can be used 
 * to call methods  in the Animal class to get information 
 * about that object or make changes to that object. 
 */

public class Zoo
    {    
        // the class with main is the client/driver class    
        
        public static void main (String[] args)    
        {        
            /*         
             * Creating a new object from a class is called instantiation.         
             * The keyword "new" is needed to create an object.         
             */        
            
            /*         
             * The type and order of values passed when making a new object         
             * must match the type and order of values in the         
             * constructor header in the Animal class.         
             */        
            
    // Make new objects
               
            Animal simba = new Animal(4, true, "lion"); 
            // order of stuff has to match stuff in the contructor
            
            Animal nemo = new Animal(0, false, "fish");
            // (int inLegs, boolean inHair, String inType)
            // object has been made now
            
 
    // Call Accessor Methods        
            
            System.out.println("Simba is a " + simba.getType());
            System.out.println("Simba has " + simba.getLegs() + " legs.");
            System.out.println("Simba has hair? " + simba.getHair());
            
            System.out.println("Nemo is a " + nemo.getType());
            System.out.println("Nemo has " + nemo.getLegs() + " legs.");
            System.out.println("Nemo has hair? " + nemo.getHair());
            
     // Call Modifier Methods 
     
            nemo.setLegs(2);
            nemo.setHair(true);
            
            System.out.println("Nemo has " + nemo.getLegs() + " legs.");
            System.out.println("Nemo has hair? " + nemo.getHair());
            
 
            
        }
    
    
    }
        