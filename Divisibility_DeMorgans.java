/*
 * To see if an integer a is divisible by another integer b, check to
 * see if the remainder after division is 0
 * 
 *      if(a % b == 0)
 *      
 * This program also demonstrates one version of DeMorgan's Law
 * which states that the negation of a conjunction (&&) is the disjunction
 * (||) of the negations.
 * 
 */
import java.util.Scanner;
public class Divisibility_DeMorgans
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int inNum = scan.nextInt();
        
        if((inNum % 2 == 0) && (inNum % 3 == 0))
            System.out.println(inNum + "is divisible by 6");
        else
            System.out.println(inNum + "is NOT divisible by 6"); 
            
        // NOW Negate the Above     !((inNum % 2 == 0) && (inNum % 3 == 0))
        // And rewrite this negation using DeMorgan's Law: 
        
        if((inNum%2 != 0) || (inNum%3 != 0))
            System.out.println(inNum + "is NOT divisible by 6");
        else
            System.out.println(inNum + "is divisible by 6");
            
        
    }
}
