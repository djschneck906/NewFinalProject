import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;

public class Bug
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x,y, speed;
    
    
    /**
     * Default constructor for objects of class Bug
     */
    public Bug(int startX, int startY)
    {
        x = startX;
        y = startY;
        speed = 4;
    }

    public void moveX(int value)
    {
        x+=value;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int newSpeed){
        speed = newSpeed;
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

    public void setX(int newX)
    {
        x = newX;
    }
    
    public void setY(int newY)
    {
        y = newY;
    }
}

