import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug 
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x,y;
    private Picture pic;

    /**
     * Default constructor for objects of class Bug
     */
    public Bug(int startX, int startY, Picture image)
    {
        x = startX;
        y = startY;
        pic = image;
    }

    
}

