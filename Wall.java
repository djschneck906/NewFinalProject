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
    private Image image;
    
    /**
     * Default constructor for objects of class Wall
     */
    public Wall(int left, int right, int top, int bottom, Image pic)
    {
        lx = left;
        rx = right;
        ty = top;
        by = bottom;
        pic = image;
    }

    
}
