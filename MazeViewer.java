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
    private static final int APPLET_WIDTH = 800;
    private static final int APPLET_HEIGHT = 500;
    Image bugPic;
    Bug hayes;
    int level = 1;
    Maze maze1;
    Maze[] mazes;
    
    /**
     * This method is the first thing to run and it runs automatically (only one time).
     * init() sets up the applet, sets the hieght, and creates some objects to be used
     */
    public void init()
    {
        setSize(APPLET_WIDTH,APPLET_HEIGHT);
        bugPic = getImage(getDocumentBase(),("bugSprite.png"));
        Wall m1w1 = new Wall(100,200,100,200);
        Wall[] m1Walls = {m1w1};
        maze1 = new Maze(m1Walls,50,50,500,550,500,550);
        //Maze maze2 = new Maze();
        //Maze maze3 = new Maze();
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
        hayes = new Bug (50, 50);
        
        //printTitleScreen();
        
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
                //playLevel(g,maze2);
                break;
        }
        
       
    }

    public void playLevel(Graphics g, Maze m)
    {
        //g.MazeObject.paintBackground();
        m.paintWalls(g);
        g.drawImage(bugPic, hayes.getX(), hayes.getY(), this);

        if(checkCollision(m))
        {
            hayes.setX(m.getStartX());
            hayes.setY(m.getStartY());
        }
        
        if (checkCompletion(m))
        {
            level+=1;
        }
    }
    
    public boolean checkCollision(Maze m)
    {
        Wall[] walls = m.getWalls();
        
        for (Wall obsticle : walls)
        {
            if (hayes.getX()+11 >= obsticle.getLeft() && hayes.getX()+11 <= obsticle.getRight() 
                && hayes.getY()+12>= obsticle.getTop() && hayes.getY()+12 <= obsticle.getBottom())
                {
                    return true;
                }
        }
        
        return false;
    }
    
    
    public boolean checkCompletion(Maze m)
    {
        if (hayes.getX() > m.getEndLeft() && hayes.getX() < m.getEndRight() 
                && hayes.getY()> m.getEndTop() && hayes.getY() < m.getEndBottom())
                {
                    return true;
                }
        
        return false;
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


        


