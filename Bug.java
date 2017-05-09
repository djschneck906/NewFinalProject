import java.lang.Object;
import java.awt.*;
import javax.swing.*;

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

    /**
     * Default constructor for objects of class Bug
     */
    public Bug(int startX, int startY)
    {
        x = startX;
        y = startY;
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

