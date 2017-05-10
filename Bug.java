import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;

public class Bug
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x,y;
    
    
    /**
     * Default constructor for objects of class Bug
     */
    public Bug(int startX, int startY)
    {
        x = startX;
        y = startY;
    }

    public void moveX(int value)
    {
        x+=value;
    }
    
    public void moveY(int value)
    {
        y+=value;
    }
    
    /**
     * get coord method
     */
    public int getX()
    {
        return x;
    }
    
    /**
     * get coord method
     */
    public int getY()
    {
        return y;
    }

    
}

