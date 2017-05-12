import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class adapter extends Applet {
	
	
	 String msg=" ";
	 int x ,y;
	public void init()
	{
	addMouseListener(new adapter1(this));
	addMouseMotionListener(new adapter2(this));
}
	
	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}
	
}
class adapter1 extends MouseAdapter
{
	adapter ab;
	public adapter1(adapter a)
	{
		ab=a;
	}
	
	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		
		ab.x=m.getX();
		ab.y=m.getY();
		ab.msg="mouse clicked "+ab.x+"  "+ab.y;
		ab.showStatus("MOUSE CLICKED");
		ab.repaint();
	}
}
	
	class adapter2 extends MouseMotionAdapter
	{
		adapter ab;
		public adapter2(adapter a)
		{
			ab=a;
		}
		
		public void mouseMoved(MouseEvent m)
		{
			ab.showStatus("mouse moved");
		}
		
		public void mouseDragged(MouseEvent m)
		{
			ab.showStatus("mouse Dragged ");
		}
		
		}
