
//import statements tell Java where to find existing classes
import java.awt.*;
import javax.swing.*;

public class FirstDrawing extends JPanel
{
	public FirstDrawing()
	{
		//set background color here
		setBackground(Color.RED);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		//use methods from the Graphics class to draw on the panel

		g.setColor(Color.YELLOW);
		g.drawString("HELLO", 200, 200); //("what", start x, start y)

		g.setColor(Color.BLACK);
		g.drawRect(30, 30, 80, 40);//(start x, start y, width, height)
		g.drawOval(120, 30, 50, 50);//(start x, start y, width, height)




	}

	public static void main(String[] args)
	{
		// sets up panel (Don't have to know this part)

		JFrame w = new JFrame("Draw Stuff");
		w.setBounds(0,0,1000,600);//last 2 nums - window size
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new FirstDrawing());
		w.setVisible(true);
	}
}
