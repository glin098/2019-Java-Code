import java.awt.*;
import javax.swing.*;

public class Happy extends JPanel
{
    
    // field
    Face face1, face2, face3;
    
    public Happy()
    {
        setBackground(Color.CYAN);
        
        face1 = new Face(Color.YELLOW);
        face2 = new Face(Color.BLUE);
        face3 = new Face(Color.RED);
        
    }
    
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // calling a parent class
        
        face1.draw(g);
        face2.draw(g);
        face3.draw(g);
        
        
    }
}