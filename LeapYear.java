import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        int year;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter year: ");
        year = scan.nextInt();
        
        boolean divbyfour;
        divbyfour = (year % 4 ==0);
       
        boolean notleapyr = (year % 100 == 0);
        boolean notleapyr2 = (year % 400 == 0);
        
        if(divbyfour && !(notleapyr && !notleapyr2))
            System.out.println("Yes");
        else
            System.out.println("No");
   
    }
}
