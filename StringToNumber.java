import java.util.Scanner;

public class StringToNumber
{
    public static void main(String[] args)
    {
        String strGrade = "";  // intializing to empty string
        
        int intGrade = 0;
        int nextGrade;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your grade: ");
        System.out.println("Type F for Freshman");
        System.out.println("Type S for Sophomore");
        System.out.println("Type J for Junior");
        System.out.println("Type SN for Senior");
        
        strGrade = scan.nextLine();
        
        if(strGrade.equals("F"))
            intGrade = 9;
        else if(strGrade.equals("S"))
            intGrade = 10;
        else if(strGrade.equals("F"))
            intGrade = 11;
        else if(strGrade.equals("F"))
            intGrade = 12;
            
        nextGrade= intGrade + 1;
        
        if(nextGrade == 10)
            System.out.println("Next year, you will be Sophomore.");
        else if(nextGrade == 11)
            System.out.println("Next year, you will be Junior.");
        else if(nextGrade == 12)
            System.out.println("Next year, you will be Senior.");
        else if(nextGrade == 13)
            System.out.println("Happy Graduation Year!");

    }
}
