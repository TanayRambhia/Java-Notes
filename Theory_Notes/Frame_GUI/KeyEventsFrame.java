import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class KeyEventsFrame extends Frame
implements KeyListener {
String msg = "";
//int X = 10, Y = 20; // output coordinates
public KeyEventsFrame()
{
addKeyListener(this);
}

public void display()
{
	System.out.println(msg);
}
public void keyPressed(KeyEvent ke) {
System.out.println("Key Down");
int key = ke.getKeyCode();
switch(key) {
case KeyEvent.VK_F1:
msg += "<F1>";
break;
case KeyEvent.VK_F2:
msg += "<F2>";
break;
case KeyEvent.VK_F3:
msg += "<F3>";
break;
case KeyEvent.VK_PAGE_DOWN:
msg += "<PgDn>";
break;
case KeyEvent.VK_PAGE_UP:
msg += "<PgUp>";
break;
case KeyEvent.VK_LEFT:
msg += "<Left Arrow>";
break;
case KeyEvent.VK_RIGHT:
msg += "<Right Arrow>";
break;
}
display(); }
public void keyReleased(KeyEvent ke) {
System.out.println("Key Up");
}
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
display();
}
// Display keystrokes.
public static void main(String args[])
{
KeyEventsFrame frame = new KeyEventsFrame();
 
  //Display the window.
  frame.setSize(400,400);
  frame.setVisible(true);
}
}