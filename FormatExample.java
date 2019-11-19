import java.text.NumberFormat; // for money and percents
import java.text.DecimalFormat; // to specify decimal places

public class FormatExample
{
   public static void main(String[]args )
    {
        // Number Format Examples
        // m and p are just names - they could be any names
        
        double num1 = 5.349;
        double num2 = .567;
        
        NumberFormat m = NumberFormat.getCurrencyInstance();
        System.out.println(m.format(num1));
        
        NumberFormat p = NumberFormat.getPercentInstance();
        System.out.println(p.format(num2));
        
        //Decimal Format Examples
        // f1 and f2 are just names - they could be any names
        
        double num3 = 1.3789;
        double num4 = 1.37;
        
        // Note- this rounds
        
        DecimalFormat f1 = new DecimalFormat("0.###");
        System.out.println(f1.format(num3));
        
        DecimalFormat f2 = new DecimalFormat("0.000");
        System.out.println(f2.format(num4));
        
    }
}
