import java.awt.event.*;
import java.awt.*;
public class MyEventsFrame extends Frame implements MouseListener,
MouseMotionListener {
    public MyEventsFrame() {
        setTitle("My Event Frame");
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Clicked at X: " + x + " - Y: " + y);
    }
 
    public void mouseEntered(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Entered frame at X: " + x + " - Y: " + y);
    }
    
    public void mouseExited(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Exited frame at X: " + x + " - Y: " + y);
    }
    
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Pressed at X: " + x + " - Y: " + y);
    }
    
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Released at X: " + x + " - Y: " + y);
    }
 
   public void mouseDragged(MouseEvent me) 
   {
        // save coordinates
        int x = me.getX();
        int y = me.getY();
        System.out.println("Dragging mouse at " + x + ", " + y);
    }   
    public void mouseMoved(MouseEvent me) 
    {
        // show status
        System.out.println("Moving mouse at " + me.getX() + ", " + me.getY());
    }

public static void main(String[] args) 
{
 
  MyEventsFrame frame = new MyEventsFrame();
 
  //Display the window.
  frame.setSize(400,350);
  frame.setVisible(true);
 
  //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 
}
 
 
} // end of class
 
