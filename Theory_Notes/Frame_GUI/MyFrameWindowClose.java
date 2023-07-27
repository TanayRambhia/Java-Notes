import java.awt.Frame;
import java.awt.event.*;
public class MyFrameWindowClose extends Frame implements WindowListener{
  MyFrameWindowClose(String title)
  {
//Register the Listeners
addWindowListener(this);  // frame object has to register itself to listener
//set window title using setTitle method
this.setTitle(title);  
setSize(300,300);      
		this.setVisible(true);
  }
public void windowClosing(WindowEvent e)  {
  //hide the window when window's close button is clicked
  System.out.println("Frame Closed");
  this.setVisible(false);    
  dispose();
  //System.exit(0); 
  }
public void windowActivated(WindowEvent we){}
public void windowClosed(WindowEvent we){}
public void windowDeactivated(WindowEvent we){}
public void windowDeiconified(WindowEvent we){}
public void windowIconified(WindowEvent we){}
public void windowOpened(WindowEvent we){}
public static void main(String args[])
 {
   MyFrameWindowClose window = new MyFrameWindowClose("My First Frame");
 } }
