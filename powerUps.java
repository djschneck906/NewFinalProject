

/**
 * Write a description of class powerUps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class powerUps
{
    /** description of instance variable x (add comment for each instance variable) */
    private int modifier, cX, cY;

    /**
     * Default constructor for objects of class powerUps
     */
    public powerUps(int modifierSpeed)
    {
        modifier = modifierSpeed;        
    }
    
    public void changeSpeed(Bug hayes){
        hayes.setSpeed(hayes.getSpeed()+ modifier);
           

    }
    
}
