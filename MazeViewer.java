
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Class MazeViewer - Runs Applet
 */
public class MazeViewer extends JFrame
{
    private static final int APPLET_WIDTH = 720;
    private static final int APPLET_HEIGHT = 680;
    
    Bug Hayes = new Bug (50, 50);
    
    /**
     * This method is the first thing to run and it runs automatically (only one time).
     * init() sets up the applet, sets the hieght, and creates some objects to be used
     */
    public void init()
    {
        setSize(APPLET_WIDTH,APPLET_HEIGHT);
        //printTitleScreen();
        //Bug Hayes = new Bug (50, 50);
        //Maze maze1 = new Maze();
        //Maze maze2 = new Maze();
        //Maze maze3 = new Maze();
        
        
        BufferedImage myPicture = ImageIO.read(new File("images\\buyg sprite.png"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        picLabel.setBounds(100, 100, 100, 100);
        add(picLabel);
        
        
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
        //g.drawImage(Hayes.getImage(), Hayes.getX(), Hayes.getY(), this);
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
