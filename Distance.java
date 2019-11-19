import java.util.Scanner;

public class Distance
{
    public static void main(String[] args)
    {
        double fx, fy; 
        double sx, sy;
        double xdiff, ydiff;
        double distance;
        
        Scanner scan = new Scanner(System.in);
        
        System. out.println("Enter first x: ");
        fx = scan.nextDouble();
        
        System. out.println("Enter first y: ");
        fy = scan.nextDouble();
        
        System. out.println("Enter second x: ");
        sx = scan.nextDouble();
        
        System.out.println("Enter second y: ");
        sy = scan.nextDouble();
        
        xdiff = sx - fx;
        ydiff = sy - fy;
        
        distance = Math.sqrt(Math.pow(xdiff,2) + Math.pow(ydiff,2));
        
        System.out.println("Point 1: (" + fx + "," + fy + ")");
        System.out.println("Point 2: (" + sx + "," + sy + ")");
        System.out.println("Distance: " + distance);
        
    }
}
