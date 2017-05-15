import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List


/**
 * 
 */
public class Wall
{
    private int lx, rx, ty, by; // intialize variables
    
    /**
     * Default constructor for objects of class Wall
     */
    public Wall(int left, int top, int right, int bottom)
    {
        lx = left;
        rx = right; //set x,y coordes of the wall rectangle for drawing
        ty = top;
        by = bottom;
    }
    
    /**
     * getLeft method
     * @return left x coord
     */
    public int getLeft()
    {
        return lx;
    }
    
    /**
     * getRight method
     * @return right x coord
     */
    public int getRight()
    {
        return rx;
    }
    
    /**
     * getTop method
     * @return top y coord
     */
    public int getTop()
    {
        return ty;
    }
    
    /**
     * getBottom method
     * @return bottom y coord
     */
    public int getBottom()
    {
        return by;
    }
}
