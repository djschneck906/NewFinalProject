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
    Image bugPic, maze1Pic, maze2Pic,maze3Pic;
    Bug hayes;
    int level = 0;
    Wall m3w1, m3w2, m3w3, m3w4, m3w5, m3w6, m3w7, m3w8, m3w9, m3w10, 
    m3w11, m3w12, m3w13, m3w14, m3w15, m3w16, m3w17, m3w18, m3w19, m3w20, 
    m3w21, m3w22, m3w23, m3w24, m3w25, m3w26, m3w27, m3w28, m3w29, m3w30, 
    m3w31, m3w32, m3w33, m3w34, m3w35, m3w36, m3w37, m3w38, m3w39, m3w40, 
    m3w41, m3w42, m3w43, m3w44, m3w45, m3w46, m3w47, m3w48, m3w49, m3w50,
    m3w51, m3w52, m3w53, m3w54, m3w55, m3w56, m3w57, m3w58, m3w59, m3w60;
    
    Maze maze1, maze2, maze3;
    Maze[] mazes;
    Wall[] m1Walls,m2Walls,m3Walls;
    
    /**
     * This method is the first thing to run and it runs automatically (only one time).
     * init() sets up the applet, sets the hieght, and creates some objects to be used
     */
    public void init()
    {
        setSize(APPLET_WIDTH,APPLET_HEIGHT);
        bugPic = getImage(getDocumentBase(),("bugSprite.png"));               
        maze3Pic = getImage(getDocumentBase(),("maze 3.png"));
                
        m3w1 = new Wall(66,25,734,28);
        m3w2 = new Wall(105,28,108,67);
        m3w3 = new Wall(142,67,178,69);
        m3w4 = new Wall(105,104,108,177);
        m3w5 = new Wall(4,3,795,3);
        m3w6 = new Wall(4,3,4,495);
        m3w7 = new Wall(63,6,65,67);
        m3w8 = new Wall(63,105,65,492);
        m3w9 = new Wall(4,493,795,495);
        m3w10 = new Wall(105,104,141,106);
        m3w11 = new Wall(66,215,141,217);
        m3w12 = new Wall(142,215,144,250);
        m3w13 = new Wall(105,251,107,324);
        m3w14 = new Wall(105,325,141,328);
        m3w15 = new Wall(142,325,144,362);
        m3w16 = new Wall(142,363,178,365);
        m3w17 = new Wall(179,363,181,436);
        m3w18 = new Wall(142,437,253,439);
        m3w19 = new Wall(66,363,107,366);
        m3w20 = new Wall(105,366,107,435);
        m3w21 = new Wall(107,400,141,402);
        m3w22 = new Wall(734,6,737,437);
        m3w23 = new Wall(216,28,219,104);
        m3w24 = new Wall(65, 474, 735, 476);
        m3w25 = new Wall(289, 364, 294, 474);
        m3w26 = new Wall(401,401, 403, 473);
        m3w27 = new Wall(401,401, 585, 403);
        m3w28 = new Wall(438, 404, 440, 435);
        m3w29 = new Wall(475, 438, 695, 435);
        m3w30 = new Wall(697, 364, 700, 473);
        m3w31 = new Wall(623, 363, 625, 435);
        m3w32 = new Wall(475, 365, 478, 400);
        m3w33 = new Wall(512, 362, 622, 365);
        m3w34 = new Wall(293, 400, 329, 402);
        m3w35 = new Wall(512, 251, 515, 365);
        m3w36 = new Wall(401, 325, 512, 328);
        m3w37 = new Wall(549, 325, 551, 363);
        m3w38 = new Wall(326, 400, 330, 434);
        m3w39 = new Wall(437, 328, 441, 363);
        m3w40 = new Wall(327, 362, 441, 365);
        m3w41 = new Wall(363, 365, 367, 436);
        m3w42 = new Wall(327, 325, 330, 364);
        m3w43 = new Wall(253, 326, 256, 439);
        m3w44 = new Wall(216, 363, 253, 365);
        m3w45 = new Wall(216, 363, 219, 399);
        m3w46 = new Wall(586, 325, 734, 328);
        m3w47 = new Wall(659, 328, 663, 399);
        m3w48 = new Wall(586, 291, 589, 321);
        m3w49 = new Wall(549, 288, 699, 291);
        m3w50 = new Wall(696, 251, 700, 290);
        m3w51 = new Wall(142, 67, 145, 181);
        m3w52 = new Wall(142, 178, 289, 181);
        m3w53 = new Wall(178, 180, 182, 292);
        m3w54 = new Wall(105, 289, 182, 292);
        
        Wall [] m3Walls = {m3w1, m3w2, m3w3, m3w4, m3w5, m3w6, m3w7, m3w8, m3w9, m3w10, 
                          m3w11, m3w12, m3w13, m3w14, m3w15, m3w16, m3w17, m3w18, m3w19, m3w20, 
                          m3w21, m3w22, m3w23, m3w24, m3w25, m3w26, m3w27, m3w28, m3w29, m3w30, m3w31, m3w32, 
                          m3w33, m3w34, m3w35, m3w36, m3w37, m3w38, m3w39, m3w40, m3w41, m3w42, m3w43, m3w44, m3w45,
                          m3w46, m3w47, m3w48, m3w49, m3w50, m3w51, m3w52, m3w53, m3w54};
                          
        maze3 = new Maze(m3Walls,10,10,500,550,500,550,maze3Pic);
        
        Wall m2w1 = new Wall(200,250,100,125);
        Wall[] m2Walls = {m2w1};
        maze2 = new Maze(m2Walls,100,100,500,550,500,550,maze2Pic);
        
        //Maze maze3 = new Maze();
        
        mazes = new Maze[]{maze3,maze2};
        
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
        
        //try {
        //    Thread.sleep(200);
        //} catch(InterruptedException ex) {         for some reason if you run this you can
        //    Thread.currentThread().interrupt();   move like 3 times then the game stops moving at all
        // }
        
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
        mazes[level].paintWalls(g);

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


        


