/*An array is a storage device that holds related items.
 * You can have an array of ints or doubles.
 * You can have an array of Strings.
 * You can have an array of other objects (Animals or Coins).
 * Each item in the array is called an element.Each element has a position (index or subscript).
 * The first position (bucket) is 0.
 * The last position is the length of the array - 1.
 * In an array of numbers, the values in the bucketsare initialized to 0.
 */

import java.util.Scanner;

public class ArrayBasics
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // declare array named 'a' with 7 buckets to hold ints 
        
        int[] a = new int[7]; // how many buckets

        System.out.println("length: "  + a.length);
        System.out.println("Value in bucket 0: "   + a[0]);
        System.out.println("Value in bucket 6: "   + a[6]);
        
        System.out.println("\nEnter values for each bucket: \n");
        
        int count; // use counter to keep track of the buckets
        
        for(count = 0; count < 7; count++)
        {
            System.out.println("Bucket " + count + ": ");
            a[count] = scan.nextInt();
        }
 
        System.out.println("\nPrinting - separate lines: \n");
        
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        
        
        System.out.println("\nPrinting - same line: \n");
        
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n\nAdding values in array: \n");
        
        int sum = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }

        System.out.print("sum: " + sum);
        
        System.out.println("\n\nHere's another way to make array\n"); 
        // when you know in advance what numbers are going to be in it
        
        int[] myArray = {4, 7, -3, 8, 16};  // initializer list, dont have to specify the size
        
        for(int j = 0; j < myArray.length; j++)
        {
            System.out.print(myArray[j] + " ");
        }
        
        
        
    
    }
}
