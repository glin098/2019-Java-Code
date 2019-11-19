// Modulus % (or remainder operator) should be used with integers 

import java.util.Scanner;

public class SecToTime
{
    public static void main(String[] args)
    {
        int TimeInSeconds;
        int hours, minutes, seconds;
        int remainSeconds;
        
        Scanner scan = new Scanner(System.in);
        
        final int IN_HOURS = 3600;
        final int IN_MINUTES= 60;
        
        System.out.println("Enter the time in seconds: ");
        TimeInSeconds = scan.nextInt();
         
        hours = TimeInSeconds / IN_HOURS; 
        
        remainSeconds = TimeInSeconds % IN_HOURS;
        
        minutes = remainSeconds / IN_MINUTES;
        
        seconds = remainSeconds % IN_MINUTES;
        
        System.out.println("The time is: " + hours + " hours and "
            + minutes + " minutes and " + seconds + " seconds.");
       
    }
    
}