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
    Image bugPic, maze1Pic, maze2Pic;
    Bug hayes;
    int level = 0;
    Maze maze1, maze2;
    Maze[] mazes;
    
    /**
     * This method is the first thing to run and it runs automatically (only one time).
     * init() sets up the applet, sets the hieght, and creates some objects to be used
     */
    public void init()
    {
        setSize(APPLET_WIDTH,APPLET_HEIGHT);
        bugPic = getImage(getDocumentBase(),("bugSprite.png"));
        maze1Pic = getImage(getDocumentBase(),("maze 1.png"));
        maze2Pic = getImage(getDocumentBase(),("background.png"));
        
        Wall m1w1 = new Wall(100,200,100,200);
        Wall[] m1Walls = {m1w1};
        maze1 = new Maze(m1Walls,50,50,500,550,500,550,maze1Pic);
        
        Wall m2w1 = new Wall(200,250,100,125);
        Wall[] m2Walls = {m2w1};
        maze2 = new Maze(m2Walls,100,100,500,550,500,550,maze2Pic);
        
        //Maze maze3 = new Maze();
        
        mazes = new Maze[]{maze1,maze2};
        
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
        hayes = new Bug (mazes[0].getStartX(), mazes[0].getStartX());
        
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
                    hayes.moveX(-hayes.getSpeed());
                    break;
                case KeyEvent.VK_RIGHT:
                    hayes.moveX(hayes.getSpeed());
                    break;
                case KeyEvent.VK_DOWN:
                    hayes.moveY(hayes.getSpeed());
                    break;
                case KeyEvent.VK_UP:
                    hayes.moveY(-hayes.getSpeed());
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
        g.drawImage(mazes[level].getMazePic(),0,0,this);
        g.drawImage(bugPic, hayes.getX(), hayes.getY(), this);

        if(checkCollision(mazes[level]))
        {
            hayes.setX(mazes[level].getStartX());
            hayes.setY(mazes[level].getStartY());
        }
        
        if (checkCompletion(mazes[level]))
        {
            level+=1;
            hayes.setX(mazes[level].getStartX());
            hayes.setY(mazes[level].getStartY());
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


        


