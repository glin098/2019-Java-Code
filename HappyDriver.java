//import statements tell Java where to find existing classes
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class HappyDriver
{
    public static void main(String[] args)
    {
        //sets up the panel, you do NOT need to know this part
        
        JFrame w = new JFrame("Happy Face");
        w.setBounds(0,0,1000, 600);
        
        //change size of window by changing last two values
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = w.getContentPane();c.add(new Happy());//make sure this is the name of the class
        w.setVisible(true);
        
    }
}