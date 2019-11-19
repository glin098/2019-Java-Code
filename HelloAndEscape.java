// HelloEscape program

// This is a console application

/*
 * Author: Mrs. Maricic
 * modified 8/16/19
 */

public class HelloAndEscape     // no semicolon
{
    public static void main(String[] args)  // no semicolon
    {
        System.out.println("Hello, World!");
        System.out.print("My name is Mrs. Maricic");
        System.out.println("   Java is fun");
        
        System.out.println(4 + 5);
        
        System.out.println("The sum is " + (4 + 5)) ;
        
        System.out.println();
        
        System.out.println("Here's another way to skip line\n");
        System.out.println("Hello, World!");        
        System.out.println("Here's how to tab\tsomething");

        /*
         * Special sequences of characters like \n or \t are
         * called escape sequences.  Escape Sequences always 
         * start with a backslash.  Some characters need an escape
         * sequence to print (they need a backslash in front of them)
         */
        
        System.out.println("Double quotes \" DO need escape sequence");
        System.out.println("Forward Slash / DOESN'T need escape sequence");      
        System.out.println("Backward Slash \\ DOES need escape sequence");      
        System.out.println("Single quotes ' DON'T need escape sequence"); 
        
        
    }
}








