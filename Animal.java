/* 
 * Provides blueprint for making a single Animal object 
 * Actual Animal objects must be made in separate client class (Zoo) 
 */ 

public class Animal
    {   // fields or instance variables    
        // private - can't be accessed directly outside class  
        
        private String type;
        private int legs;
        private boolean hair;
        
        
        
/*     
 * constructor (makes the animal)     
 * - procedure for making an animal object     
 * - usually initializes field values     
 * - always has same name as class  
 * - make it public 
 */ 

     public Animal(int inLegs, boolean inHair, String inType)
     {
         legs = inLegs;
         hair = inHair;
         type = inType; 
      }
      
      
      
      
/*     
 * accessor methods     
 * - called by a specific object in client class     
 * - returns private field values of object to client class (Zoo)
 * let them have access to privte fields
 * 
 */ 


    public int getLegs()
    {
         return legs;
    }
        
    public boolean getHair()
    {
        return hair;
    }
    
    public String getType()
    {
        return type;
    }

/*    
 * modifier methods     
 * - called by a specific object in client class     
 * - allows client class to change private fields values of object     
 */ 

     public void setLegs(int inLegs)
     {
         legs = inLegs;
     }
     
     public void setHair(boolean inHair) 
     // void = making chnages to object but othing returns to print
     {
         hair = inHair;
     }
     
        
     
     }