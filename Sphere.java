import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere
{
    public static void main(String[] args)
    
    {
        Scanner scan = new Scanner(System.in);
      
        double radius;
        double volume; 
        double sa;
        
        final double PI = 3.14159;
       
        System.out.println("Enter the radius: ");
        radius = scan.nextInt();
          
        volume = 4.0/3 * PI * radius * radius * radius;
        sa = 4 * PI * radius * radius;
    
        DecimalFormat v = new DecimalFormat("0.0000");
        
        DecimalFormat surfa = new DecimalFormat("0.0000");
        
        System.out.println("Radius entered: " + radius);
        System.out.println("Volume: " + v.format(volume));
        System.out.println("Surface area: " + surfa.format(sa));
        
        
        
   
    }
}
