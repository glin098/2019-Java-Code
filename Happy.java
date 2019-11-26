import java.awt.*;
import javax.swing.*;

public class Happy extends JPanel
{
    
    // field
    Face face1;
    
    public Happy()
    {
        setBackground(Color.CYAN);
        
        face1 = new Face(Color.YELLOW);
    }
    
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // calling a parent class
        
        face1.draw(g);
        
        
        
    }
}