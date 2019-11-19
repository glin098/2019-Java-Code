import java.util.Scanner;

public class TimeToSec
{
    public static void main(String[] args)
    {
        int hours, hoursToSec;
        int minutes, minutesToSec;
        int seconds, totalSec;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the hours: ");
        hours = s.nextInt();
        
        System.out.println("Enter the minutes: ");
        minutes = s.nextInt();
        
        System.out.println("Enter the seconds: ");
        seconds = s.nextInt();
        
        hoursToSec = hours * 3600 ;
        minutesToSec = minutes * 60;
        totalSec= hoursToSec + minutesToSec + seconds;
        
        
        System.out.println("The time in seconds is: " + totalSec); 
        
        
       // add the seconds into not onto
    }
}