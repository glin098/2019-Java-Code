
import java.util.Scanner;

public class MyString
{
   public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       
       String s1; 
       String s2, s3, s4; 
       
       System.out.println("Enter a word or a phrase: ");
       s1 = scan.nextLine();
       
       s2 = s1.toUpperCase(); 
       System.out.println("Word in uppercase: " + s2);
       
       s3 = s1.toLowerCase();
       System.out.println("Word in lowercase: " +s3);
       
       int len = s1.length();
       System.out.println("String length: " + len); // length counts spaces and punctuation
       
       int pos = s1.indexOf('a');
       System.out.println("Position of first 'a' is: " + pos);
       
       s4 = s1.replace('a', '4');
       System.out.println("With replacement, the new string is: " + s4); 
       
   
    }
}
