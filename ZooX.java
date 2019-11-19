/* 
 * This is the client (or driver) class which constructs 
 * individual objects of type Animal (by calling a constructor in 
 * the Animal class.) 
 *  
 * After an individual object has been created, it can be used 
 * to call methods  in the Animal class to get information 
 * about that object or make changes to that object. 
 */

public class ZooX
    {    
        // the class with main is the client/driver class    
        
        public static void main (String[] args)    
        {    
            System.out.println("I added a new integer field for the number of eyes an animal has.\n");
            
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
               
            AnimalX simba = new AnimalX(4, 2, true, "lion"); 
            // order of stuff has to match stuff in the contructor
            
            AnimalX nemo = new AnimalX(0, 2, false, "fish");
            // (int inLegs, int inEyes, boolean inHair, String inType)
            // object has been made now
            
            AnimalX peppa = new AnimalX(2, 2, true, "pig");
            // new animal
 
    // Call Accessor Methods        
            
            System.out.println("Simba is a " + simba.getType());
            System.out.println("Simba has " + simba.getLegs() + " legs.");
            System.out.println("Simba has " + simba.getEyes() + " eyes.");
            System.out.println("Simba has hair? " + simba.getHair());
            
            
            System.out.println("\nNemo is a " + nemo.getType());
            System.out.println("Nemo has " + nemo.getLegs() + " legs.");
            System.out.println("Nemo has " + nemo.getEyes() + " eyes.");
            System.out.println("Nemo has hair? " + nemo.getHair());

     // Call Modifier Methods -- new modifier method (eyes)
     
            nemo.setLegs(4);
            nemo.setEyes(4);
            nemo.setHair(false);
            
            System.out.println("\nNemo has " + nemo.getLegs() + " legs.");
            System.out.println("Nemo has " + nemo.getEyes() + " eyes.");
            System.out.println("Nemo has hair? " + nemo.getHair());
            
     // new animal
            System.out.println("\nPeppa is a " + peppa.getType());
            System.out.println("Peppa has " + peppa.getLegs() + " legs.");
            System.out.println("Peppa has " + peppa.getEyes() + " eyes.");
            System.out.println("Peppa has hair? " + peppa.getHair());
  
        }
    
    
    }
        