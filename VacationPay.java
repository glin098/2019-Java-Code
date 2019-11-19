import java.util.Scanner;

public class VacationPay
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int years;
        
        System.out.println("Enter years of work: ");
        years = s.nextInt();

            if (years <= 1)
                System.out.println("Vacation Days: 5");
            else if(years >= 2 && years <= 5)
                System.out.println("Vacation Days: 10");
            else if(years >= 6 && years <= 10)
                System.out.println("Vacation Days: 15");
            else if(years >= 11)
                System.out.println("Vacation Days: 20");
  
        }
    
}