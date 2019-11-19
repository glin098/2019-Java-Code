import java.awt.*;

public class Candle
{
	// INSTANCE DATA or FIELDS for a Candle.

	//Each Candle "has-a".......
	//...starting x position
	//...starting y position
	//...a true/false value for "lit"
	//...Color

	private int myx;
	private int myy;
	private boolean myflame;
	private Color mycolor;

	// CONSTRUCTOR to make and set values for a Candle

	 public Candle (int inx, int iny, boolean inflame, Color incolor)
	 {
		 myx = inx;
		 myy = iny;
		 myflame = inflame;
		 mycolor = incolor;
	 }

	//  METHOD to draw a Candle (calls prexisting methods from Java API)

	 public void drawCandle(Graphics g)
	 {
		  g.setColor(mycolor);
		  g.fillRect(myx, myy, 20, 60);

		  g.setColor(Color.orange);

		  if (myflame)
			g.fillOval(myx+3, myy-30, 14, 20);
		  else
			g.drawOval(myx+3, myy-30, 14, 20);
	 }
 }