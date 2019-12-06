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
    
    public Face(Color inColor, int myX, int myY)
    {
        myColor = inColor;
        myX = 20;
        myY = 20; 
    }
    
    public Face(Color setColor)
    {
        myColor = setColor;
        myX = 200;
        myY = 200; 
    }

    
    public void draw(Graphics g)
    {
        // yellow happy face
        g.setColor(myColor);
        g.fillOval(myX, myY, 100, 100); // (x, y, width, height)
        g.fillOval(myX, myY, 300, 100);
        
        g.setColor(Color.BLACK);

        g.fillOval(130, 230, 10, 16);// left eye
        g.fillOval(160, 230, 10, 16);
        g.fillArc(123, 250, 55, 30, 0, -180); // smile
        
        
        //blue happy face
        g.setColor(myColor);
        
        
        g.fillOval(330, 430, 10, 16);
        g.fillOval(360, 430, 10, 16);
        g.fillArc(323, 450, 55, 30, 0, -180);
        
        
    }
}