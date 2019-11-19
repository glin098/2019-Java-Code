//We need to use formula: F = (9/5)C + 32

import java.util.Scanner;

public class TempConverter
{
    public static void main(String[] args)
    {
        int cTemp;
        double fTemp;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter temp. in Celsius: ");
        cTemp = scan.nextInt();
        
        fTemp = (9.0/5) * cTemp +32; //made the 9 a double with the .0 make sure the double in the ()
        fTemp = (9/5.0) * cTemp +32;
        fTemp = ((double)9/5) * cTemp +32;
        fTemp = (9/(double)5) * cTemp +32;
        
        // NO fTemp = (double)(9/5) * cTemp + 32 //cast is too late
        
        System.out.println("Temp. in Farenheit is " +fTemp);
        
    }
}