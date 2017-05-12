import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class demoevent extends Applet implements MouseListener 
{

	String msg=" ";
	int x=0,y=0;
	public void init()
	{
		addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		
		x=m.getX();
		y=m.getY();
		msg="mouse clicked";
		showStatus("MOUSE CLICKED");
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent m) {
		// TODO Auto-generated method stub
		x=100;
		y=200;
		msg="mouse entered";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent m) {
		// TODO Auto-generated method stub
		x=m.getX();
		y=m.getY();
		msg="mouse presssing  "+m.getX()+" "+m.getY();
		showStatus("MOUSE PRESSED");
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent m) {
		// TODO Auto-generated method stub
		x=m.getX();
		y=m.getY();
		msg="releasing mouse button";
		repaint();
	}
	
	
	public void paint(Graphics g)
	{
		g.drawString(msg, x, y);
	}
}


