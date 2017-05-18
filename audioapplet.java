import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="audio" width=300 height=100>
</applet>*/
public class audio extends Applet implements ActionListener
{
Button play;
AudioClip ac;
public void init()
{
play = new Button("PLAY");
add(play);
play.addActionListener(this);
ac = getAudioClip(getCodeBase(),"m.wav");
}

public void actionPerformed(ActionEvent e)
{
Button source=(Button)e.getSource();
if(source.getLabel()=="PLAY");
{
ac.play();
}
}

}
