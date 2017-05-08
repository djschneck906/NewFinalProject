
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;

/**
 * Class MazeViewer - Runs Applet
 */
public class MazeViewer extends JApplet
{
    private static final int APPLET_WIDTH = 720;
    private static final int APPLET_HEIGHT = 680;
    
    /**
     * This method is the first thing to run and it runs automatically (only one time).
     * init() sets up the applet, sets the hieght, and creates some objects to be used
     */
    public void init()
    {
        setSize(APPLET_WIDTH,APPLET_HEIGHT);
        printTitleScreen();
        
        //Maze maze1 = new Maze();
        //Maze maze2 = new Maze();
        //Maze maze3 = new Maze();
    }

    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
    }

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        
    }
    
    public void playLevel(Maze maze, Graphics g)
    {
        //g.MazeObject.paintBackground();
        //g.MazeObject.paintObsticles();
        //g.BugObject.paintObject();
        
        //use keylistener to check to see if bug moves
        //use collision dector to see if collision
        // see if completed
        
        //if collision - move back to start
        //if completed - base case - back to paint 
        
        //else 
        playLevel(maze,g);
       
        
        
    }
    
}
