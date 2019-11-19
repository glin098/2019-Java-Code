import java.util.Scanner;

public class Birth
{
    public static void main(String[] args)
    {
        int year, month, day;
        int finalyear = 0;
        int add, mod;
        int monthconvert = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter year: ");
        year = scan.nextInt();
        
        System.out.println("Enter month: ");
        month = scan.nextInt();
        
        System.out.println("Enter day: ");
        day = scan.nextInt();
        
        if(year >= 1900 && year < 2000) 
         {  year = year - 1900;
            finalyear = year / 4;
         }
        else if(year >= 2000)
          { year = year - 2000;
            finalyear = ((year / 4) + 6);
          }
          
        boolean leapyear;
        leapyear = (year % 4 == 0);
       
        boolean notleapyr = (year % 100 == 0);
        boolean notleapyr2 = (year % 400 == 0);
        
        if(leapyear && !(notleapyr && !notleapyr2))
  
        if(month == 01 && leapyear)
            monthconvert = 0;
        else monthconvert = 1;
        
        if(month == 02 && leapyear)
            monthconvert = 3;
        else monthconvert = 4;
        
        if(month == 03)
            monthconvert = 4;
        else if(month == 04)
            monthconvert = 0;
        else if(month == 05)
            monthconvert = 2;
        else if(month == 06)
            monthconvert = 5;
        else if(month == 07)
            monthconvert = 0;
        else if(month == 8)
            monthconvert = 3;
        else if(month == 9)
            monthconvert = 6;
        else if(month == 10)
            monthconvert = 1;
        else if(month == 11)
            monthconvert = 4;
        else if(month == 12)
            monthconvert = 6;

        add = year + finalyear + monthconvert + day; // 95 + 23 + 6 + 5
        
        
        mod = add % 7; //3 
        
        if(mod == 1)
            System.out.println("The day of the week is Sunday");
        else if(mod == 2)
            System.out.println("The day of the week is Monday");
        else if(mod == 3)
            System.out.println("The day of the week is Tuesday");
        else if(mod == 4)
            System.out.println("The day of the week is Wednesday");
        else if(mod == 5)
            System.out.println("The day of the week is Thursday");
        else if(mod == 6)
            System.out.println("The day of the week is Friday");
        else if(mod == 0)
            System.out.println("The day of the week is Saturday");
        
   
   
    }
}
