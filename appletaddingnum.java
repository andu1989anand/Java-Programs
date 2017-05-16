import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="a" width=300 height=200>
</applet>
*/
public class a extends Applet implements ActionListener
{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1;

public void init()
{
l1=new Label("enter num 1:");
add(l1);
t1=new TextField(20);
add(t1);

l2=new Label("enter num 2:");
add(l2);
t2=new TextField(20);
add(t2);

l3=new Label("ADDITION:");
add(l3);
t3=new TextField(20);
add(t3);

b1=new Button("ADD");
add(b1);
b1.addActionListener(this);
add(new Label("click ADD BUTTON"));
}


public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a+b;
t3.setText(String.valueOf(c));
}
}
}
