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
    int endXRight;  //initialize variables
    int endYTop;
    int endYBottom;
    Image mazePic;

    /**
     * Default constructor for objects of class Maze
     */
    public Maze(Wall[] wall, int sX, int sY,int eXL, int eXR, int eYT, int eYB, Image pic)
    {
        walls = wall;
        startX = sX;
        startY = sY;
        endXLeft = eXL;
        endXRight = eXR;
        endYTop = eYT;
        endYBottom = eYB;
        mazePic = pic;
    }
    
    /**
     * getMazePic method
     * @return image of the maze to load into graphic
     */
    public Image getMazePic()
    {
        return mazePic;
    }
    
    /**
     * paintWalls method
     * paints the walls of the maze as rectangles onto graphics as red rectangle objects
     */
    public void paintWalls(Graphics g)
    {
        for (Wall obsticle : walls) //goes through array of wall objects
        {
            g.setColor(Color.red); // sets wall color to red
            g.fillRect(obsticle.getLeft(),obsticle.getTop(), // draws a rectangle with the same
                       obsticle.getRight()-obsticle.getLeft(), //dimensions as the wall object
                       obsticle.getBottom()-obsticle.getTop());
        }
    }
    
    /**
     * getWalls method
     * @return array of Wall objects
     */
    public Wall[] getWalls()
    {
        return walls;
    }
    
    /**
     * getStartX Method
     * @return players starting X position for this maze object
     */
    public int getStartX()
    {
        return startX;
    }
    
    /**
     * getStartY Method
     * @return players starting Y position for this maze object
     */
    public int getStartY()
    {
        return startY;
    }
    
    /**
     * getEndLeft Method
     * @return the left x bound of the ending area of the maze object
     */
    public int getEndLeft()
    {
        return endXLeft;
    }
    
    /**
     * getEndRight Method
     * @return the right x bound of the ending area of the maze object
     */
    public int getEndRight()
    {
        return endXRight;
    }
    
    /**
     * getEndTop Method
     * @return the top y bound of the ending area of the maze object
     */
    public int getEndTop()
    {
        return endYTop;
    }
    
    /**
     * getEndBottom Method
     * @return the bottom y bound of the ending area of the maze object
     */
    public int getEndBottom()
    {
        return endYBottom;
    }
}
