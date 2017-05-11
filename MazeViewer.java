import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.applet.*;
import java.awt.event.*;

/**
 * Class MazeViewer - Runs Applet
 */
public class MazeViewer extends Applet implements KeyListener
{
    private static final int APPLET_WIDTH = 720;
    private static final int APPLET_HEIGHT = 680;
    Image bugPic;
    Bug hayes;
    int level = 1;
    
    /**
     * This method is the first thing to run and it runs automatically (only one time).
     * init() sets up the applet, sets the hieght, and creates some objects to be used
     */
    public void init()
    {
        setSize(APPLET_WIDTH,APPLET_HEIGHT);
        bugPic = getImage(getDocumentBase(),("bugSprite.png"));
        //printTitleScreen();
        //Maze maze1 = new Maze();
        //Maze maze2 = new Maze();
        //Maze maze3 = new Maze();
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
        hayes = new Bug (50, 50);
        
    }
    
     public void keyTyped(KeyEvent e) {
        return;
    }
    
     public void keyPressed(KeyEvent e) {
        
        if (hayes != null)
        {
           switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    hayes.moveX(-3);
                    break;
                case KeyEvent.VK_RIGHT:
                    hayes.moveX(3);
                    break;
                case KeyEvent.VK_DOWN:
                    hayes.moveY(3);
                    break;
                case KeyEvent.VK_UP:
                    hayes.moveY(-3);
                    break;
           }
        }
        repaint();
    }
    
    public void keyReleased(KeyEvent e) {
        return;
    }
    
    
    /**
     * Paint method for applet.
     *
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        switch (level)
        {
            case 1:
                playLevel(g,maze1);
                break;
            case 2:
                playLevel(g,maze2);
                break;
        }
        
    }

    public void playLevel(Graphics g, Maze m)
    {
        //g.MazeObject.paintBackground();
        //g.MazeObject.paintObsticles();
        g.drawImage(bugPic, hayes.getX(), hayes.getY(), this);

        //use collision dector to see if collision
        // see if completed

        //if collision - move back to start
        //if completed - base case - back to paint
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
}


        


