import java.util.Scanner;

public class LetterCounter
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       
       String word = " ";
       int count = 0;
       int pos = 0;
       
       System.out.println("Enter a word or a phrase: ");
       word = scan.nextLine();
       
       System.out.println("Enter the letter you want to count: ");
       char letter = scan.nextLine().charAt(0);

       while(pos < word.length())       
       {
           char c = word.charAt(pos);
           
           if(c == letter)
           count++;
           else
           count = count;
           
           pos++;
           
        }   
            
        System.out.println("There are " + count + " " + letter + " 's.");
            
    }
}
