import java.awt.*; // * importing all classes in that package

public class Face
{
    private int myX;
    private int myY;
    private Color myColor;
    
    // constructor with default values for x and y
    public Face(Color inColor)
    {
        myColor = inColor;
        myX = 100;
        myY= 200;
    }

    
    public void draw(Graphics g)
    {
        g.setColor(myColor);
        g.fillOval(myX, myY, 100, 100); // (x, y, width, height)
        
        g.setColor(Color.BLACK);
        
        g.fillOval(130, 230, 10, 16); // left eye
        g.fillOval(230, 330, 10, 16);
        g.fillArc(123, 250, 55, 30, 0, -180); // smile
        
        
    }
}