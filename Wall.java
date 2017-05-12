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
    private int lx, rx, ty, by;
    
    /**
     * Default constructor for objects of class Wall
     */
    public Wall(int left, int top, int right, int bottom)
    {
        lx = left;
        rx = right;
        ty = top;
        by = bottom;
    }

    public int getLeft()
    {
        return lx;
    }
    
    public int getRight()
    {
        return rx;
    }
    
    public int getTop()
    {
        return ty;
    }
    
    public int getBottom()
    {
        return by;
    }
}
