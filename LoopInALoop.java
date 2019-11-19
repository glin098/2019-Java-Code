// on EvenOdd and LetterCountr program
import java.util.Scanner;

public class LoopInALoop
{
    public static void main(String[] args)
    {
       String word;
       int pos;         // position in word (starts at 0)
       boolean contin = true;
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter a word: ");
       word = scan.nextLine();
       
       while(contin)        // same as while(contin == true)
       {
           
           pos = 0;
           
           System.out.println("Length of word: " + word.length());
           
           while(pos < word.length())       // last position is length - 1
           {
               char c = word.charAt(pos);
               
               System.out.println("position: " + pos + " charcter: " + c);
               
               pos++;
               
            }   // end inner while loop
            
            System.out.println("\nEnter a word of Q to quit: ");
            word = scan.nextLine();
            
            if(word.equalsIgnoreCase("Q"))
                contin = false;
            else
                contin = true;
                
            }
       
    }
}
