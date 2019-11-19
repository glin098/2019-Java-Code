package StringProject;


/**
 *Demonstrating some methods from the String class
 *
 *Strings are objects, not primitive data types like
 *int, double, boolean, and char.
 *
 *The String class comes from the java.lang package
 *and is imported automatically
 */

import java.util.Scanner;

public class StringFunctions
{
   public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       
       String s1; 
       String s2, s3; 
       
       System.out.println("Enter a word or a phrase: ");
       s1 = scan.nextLine();
       
       s2 = s1.toUpperCase(); //s1 itself doesn't change
       
       System.out.println("Word in uppercase: " + s2);
       
       s3 = s1.replace('o', 'a');
       System.out.println("With replacement: " + s3); 
       
       //length counts spaces and punctuation
       
       int len = s1.length();
       System.out.println("Length: " + len);
       
       // first position is 0 
       // position includes spaces and punctuations
       // last position one less than the length
       
       int pos = s1.indexOf('r');
       System.out.println("Position of first 'r' is: " + pos);
    }
}
