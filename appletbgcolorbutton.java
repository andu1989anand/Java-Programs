import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="a" width=300 height=200>
</applet>
*/
public class a extends Applet implements ActionListener
{
int f;
Button b1=new Button("red");
Button b2=new Button("green");
Button b3=new Button("blue");

public void init()
{
add(b1);
b1.addActionListener(this);
add(b2);
b2.addActionListener(this);
add(b3);
b3.addActionListener(this);
add(new Label("click a button to change the screen color"));
}

public void paint(Graphics g)
{
if(f==1)
setBackground(Color.red);
if(f==2)
setBackground(Color.green);
if(f==3)
setBackground(Color.blue);
}
public void actionPerformed(ActionEvent e)
{
String str=e.getActionCommand();
if(str.equals("red"))
{
f=1;
repaint();
}

if(str.equals("green"))
{
f=2;
repaint();
}

if(str.equals("blue"))
{
f=3;
repaint();
}
}

}
