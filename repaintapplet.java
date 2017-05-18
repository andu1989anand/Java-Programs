import java.awt.*;
import java.applet.*;
/*<applet code="repaintapplet" width=300 height=100>
<param name="M" value=" ATMECE">
</applet>*/
public class repaintapplet extends Applet
{
public void paint(Graphics g)
{
String msg=this.getParameter("M");
if(msg==null)
msg="FRIENDS";
msg="WELCOME"+msg;
g.drawString(msg,100,100);
repaint(1000,10,10,200,200);
g.drawString("ANANDA KUMAR HN",400,400);
}
}
