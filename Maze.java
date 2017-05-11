import java.util.*;
import java.awt.*;

/**
 * 
 */
public class Maze
{
    Wall[] walls;
    int startX;
    int startY;
    int endXLeft;
    int endXRight;
    int endYTop;
    int endYBottom;

    /**
     * Default constructor for objects of class Maze
     */
    public Maze(Wall[] wall, int sX, int sY,int eXL, int eXR, int eYT, int eYB)
    {
        walls = wall;
        startX = sX;
        startY = sY;
        endXLeft = eXL;
        endXRight = eXR;
        endYTop = eYT;
        endYBottom = eYB;
    }
    
    public void paintWalls(Graphics g)
    {
        for (Wall obsticle : walls)
        {
            g.setColor(Color.black);
            g.fillRect(obsticle.getLeft(),obsticle.getTop(),
                       obsticle.getRight()-obsticle.getLeft(), 
                       obsticle.getBottom()-obsticle.getTop());
        }
    }
    
    public Wall[] getWalls()
    {
        return walls;
    }
    
    public int getStartX()
    {
        return startX;
    }
    
    public int getStartY()
    {
        return startY;
    }
    
    public int getEndLeft()
    {
        return endXLeft;
    }
    
    public int getEndRight()
    {
        return endXRight;
    }
    
    public int getEndTop()
    {
        return endYTop;
    }
    
    public int getEndBottom()
    {
        return endYBottom;
    }
}
