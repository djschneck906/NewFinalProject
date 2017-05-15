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
        y = startY; // initialize bugs maze start location and speed
        speed = 4;
    }

    /**
     * moveX method
     * changes the X value of player based on key listener
     */
    public void moveX(int value)
    {
        x+=value;
    }
    
    /**
     * get Speed method
     * @return int speed of player
     */
    public int getSpeed(){
        return speed;
    }
    
    /**
     * setSpeed method
     * @param new speed of the player
     */
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    
    /**
     * moveY method
     * changes the Y value of player based on key listener
     */
    public void moveY(int value)
    {
        y+=value;
    }
    
    /**
     * get coord x method
     * @return X position of player
     */
    public int getX()
    {
        return x;
    }
    
    /**
     * get coord Y method
     * @return Y position of player
     */
    public int getY()
    {
        return y;
    }
    
    /**
     * set X method
     * @param int new X value for player
     */
    public void setX(int newX)
    {
        x = newX;
    }
    
    /**
     * set Y method
     * @param int new Y value for player
     */
    public void setY(int newY)
    {
        y = newY;
    }
}

