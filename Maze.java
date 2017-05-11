import java.util.*;

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
