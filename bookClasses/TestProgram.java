import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Write a description of class TestProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestProgram
{
    public static void main(String[] args){
        
        //Picture copyTo = new Picture(FileChooser.pickAFile());
        Picture copyTo = new Picture("images\\640x480.jpg");  
        Picture pic = new Picture("images\\arch.jpg");
        Picture pic2 = new Picture("images\\arch.jpg");
        copyTo.mirrorVertical(0, 0, pic);
        //copyTo.copyPic(0, 0, 360, 0, pic.getWidth(), pic.getHeight(), pic);        
        //copyTo.copySmaller(720,0, pic2);
        //copyTo.copySmaller(720+(360/2),0, pic);
        copyTo.explore();
    }
    
}
