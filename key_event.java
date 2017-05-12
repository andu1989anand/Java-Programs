import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class demokey extends Applet implements KeyListener{

	/**
	 * @param args
	 */
	
	String msg=" ";
	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		showStatus("key pressed");
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		showStatus("key released");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		Font f;
		f=new Font("anand",Font.BOLD,20);
		msg+=arg0.getKeyChar();
		setFont(f);
		repaint();
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg, 30, 70);
	}

}
