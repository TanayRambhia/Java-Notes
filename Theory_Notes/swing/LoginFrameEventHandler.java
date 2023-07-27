import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

class LoginFrameEventHandler implements ActionListener,ItemListener
{
LoginFrameGUI lfgui;	
LoginFrameEventHandler(LoginFrameGUI lfgui)
{
this.lfgui=lfgui;
}
public void actionPerformed(ActionEvent ae)
{


}

public void itemStateChanged(ItemEvent e) 
{ 
        
   if (e.getStateChange() == ItemEvent.SELECTED) 
   {
      lfgui.passwordField.setEchoChar((char) 0); 
   } 
   else 
   {  
      lfgui.passwordField.setEchoChar('*');  
   } 
}

}// end of class