import java.util.Scanner;

public class Pythagorean
{
    public static void main(String[] args)
    {
        double a, b; // legs of right triangle
        double hyp; // hypotenuse of right triangle
        
        Scanner scan = new Scanner(System.in);
        System. out.println("Enter one leg of right triangle: ");
        a = scan.nextDouble();
        
        System.out.println("Enter other leg of right triangle: ");
        b = scan.nextDouble();
        
        hyp = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        
        System.out.println("The hypotenuse is " + hyp);
    }
}
