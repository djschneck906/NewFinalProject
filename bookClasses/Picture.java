import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from
 * SimplePicture and allows the student to add functionality to
 * the Picture class.
 *
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture
{
  ///////////////////// constructors //////////////////////////////////
  private int counter = 0;
  /**
   * Constructor that takes no arguments
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }

  /**
   * Constructor that takes a picture and creates a
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() +
      " height " + getHeight()
      + " width " + getWidth();
    return output;

  }

  public static void main(String[] args)
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
  } 
    
    /**
   * Method to negate the picture
   */
   public void negate(Picture pic)
   {   
       Pixel[] pixelArray = pic.getPixels();
       Pixel pixel = null;
       int redValue, blueValue, greenValue =0;

       //loop through all the pixels
       for (int i = 0; i<pixelArray.length; i++)
       {
           //get the current pixel
           pixel = pixelArray[i];

           //get the current red,green and blue values
           redValue = pixel.getRed();
           greenValue = pixel.getGreen();
           blueValue = pixel.getBlue();

           //set the pixel's color to the new color
           pixel.setColor(new Color(255 - redValue/2,
                                    255 - greenValue,
                                    255 - blueValue/2));
       }//end of for
   }//end of negate
   
   /**
    * copyPicPart
    * copies part of a picture
    */
   public void copyPic(int xS, int yS, int xT, int yT, int xB, int yB, Picture sourceF){
        
        Picture sourcePicture = sourceF;
        
        Pixel sourcePixel = null;
        Pixel targetPixel = null;
        
        //width of source must be equal or less than the canvas I am copying to
            for (int sourceX = xS, targetX = xT; /// increase target x pixel and source x pixel
                sourceX < xB;
                sourceX++, targetX++)
            {
                for (int sourceY = yS, targetY = yT; /// increase target y pixel and source y pixel
                sourceY < yB;
                sourceY++, targetY++)
                {
                    sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
                    targetPixel = this.getPixel(targetX, targetY); //copy cource pixel to target pixel
                    targetPixel.setColor(sourcePixel.getColor());
                }
            }
            
        }        
 
       
  /**
   * Copy Smaller
   */
     public void copySmaller(int xT, int yT, Picture sourceF){
      Picture sourcePicture = sourceF;
            
            Pixel sourcePixel = null;
            Pixel targetPixel = null;
                                    
            //width of source must be equal or less than the canvas I am copying to
                for (int sourceX = 0, targetX = xT;
                    sourceX < sourcePicture.getWidth()-2; // increase target x pixel and source x pixel
                    sourceX+=2, targetX++)
                {
                    for (int sourceY = 0, targetY = yT;
                    sourceY < sourcePicture.getHeight()-2; // increase target y pixel and source y pixel
                    sourceY+=2, targetY++)
                    {
                        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
                        targetPixel = this.getPixel(targetX, targetY);
                        //System.out.println(targetX + "\t" + targetY);
                        targetPixel.setColor(sourcePixel.getColor());
                    }
                }
    }
    
    /**
    * Posterize
    * makes the pictures all only 6 colors
    */
   public void Posterize(int xS, int yS, Picture sourceF){
        
        Picture sourcePicture = sourceF;
        
        Pixel sourcePixel = null;     
        
        //width of source must be equal or less than the canvas I am copying to
            for (int sourceX = xS;
                sourceX < sourceF.getWidth(); // increase target x pixel and source x pixel
                sourceX++)
            {
                for (int sourceY = yS;
                sourceY < sourceF.getHeight(); // increase target y pixel and source y pixel
                sourceY++)
                {
                    sourcePixel = sourcePicture.getPixel(sourceX, sourceY); // take source pixel 
                    
                    //copy pixel based on averaged color (red scale)
                    if (sourcePixel.getRed() < 43) 
                        sourcePixel.setColor(new Color(48, 4, 94)); // dark purple
                    else if (sourcePixel.getRed() < 86)
                        sourcePixel.setColor(new Color(94, 50, 50)); // dark blue
                    else if (sourcePixel.getRed() < 129)
                        sourcePixel.setColor(new Color(186, 124, 106)); // tan
                    else if (sourcePixel.getRed() < 172)
                        sourcePixel.setColor(new Color(128, 50, 201)); // light purple
                    else if (sourcePixel.getRed() < 215)
                        sourcePixel.setColor(new Color(138, 179, 216)); // light blue
                    else
                        sourcePixel.setColor(new Color(226, 225, 215));  // off white 
                }
            }
            
        }  
        
    /**
    *colorBlue
    * colors the picture blue
    */
   public void ColorBlue(Picture sourceF){
                       
       
       Pixel[] pixelArray = sourceF.getPixels();
       Pixel targetPixel = null;
       int redValue, blueValue, greenValue = 0;

       //loop through all the pixels
       for (int i = 0; i<pixelArray.length; i++)
       {
           //get the current pixel
           targetPixel = pixelArray[i];

           //get the current red,green and blue values
           redValue = targetPixel.getRed();
           greenValue = targetPixel.getGreen();
           blueValue = targetPixel.getBlue();

           //set the pixel's color to the new color
          Color newColor = new Color(targetPixel.getRed()/2, targetPixel.getGreen()/2,  targetPixel.getBlue());
          targetPixel.setColor(newColor);
       }//end of for
                                      
    
       
    }
    
    /**
    *colorRed
    * colors the picture red
    */
   public void ColorRed(Picture sourceF){
                       
       
       Pixel[] pixelArray = sourceF.getPixels();
       Pixel targetPixel = null;
       int redValue, blueValue, greenValue = 0;

       //loop through all the pixels
       for (int i = 0; i<pixelArray.length; i++)
       {
           //get the current pixel
           targetPixel = pixelArray[i];

           //get the current red,green and blue values
           redValue = targetPixel.getRed();
           greenValue = targetPixel.getGreen();
           blueValue = targetPixel.getBlue();

           //set the pixel's color to the new color
          Color newColor = new Color(targetPixel.getRed(), targetPixel.getGreen()/2,  targetPixel.getBlue()/2);
          targetPixel.setColor(newColor);
       }//end of for
                                      
    
       
    }
    
    /**
    * copyrecursivesmaller
    * keeps shrinking the same picture
    */
   public void copyRecursiveSmall(){
       
            Pixel sourcePixel = null;
            Pixel targetPixel = null;
                                    
            //width of source must be equal or less than the canvas I am copying to
                for (int sourceX = 0, targetX = 0; sourceX < this.getWidth(); sourceX+=2, targetX++) // smaller by 2
                {
                    for (int sourceY = 0, targetY = 0; sourceY < this.getHeight(); sourceY+=2, targetY++) //smaller by 2
                    {
                        sourcePixel = this.getPixel(sourceX, sourceY);
                        targetPixel = this.getPixel(targetX, targetY);  //copy target pic to canvas
                        targetPixel.setColor(sourcePixel.getColor());
                    }
                }
  

            } 
            
    /**
    * copyrecursivesmaller
    * keeps shrinking the same picture
    */
   public void recursion(int xT, int yT, Picture sourceF, int n){
                                           
            while (n < 4){
                this.copyPic(0, 0, xT, yT, sourceF.getWidth(), sourceF.getHeight(), sourceF); //copy shrunken pic
                sourceF.copyRecursiveSmall(); // call shrink method
                sourceF.recursion(xT, yT, sourceF, ++n);    //call smaller pic recursively            
            }

            } 




}// this } is the end of class Picture, put all new methods before this