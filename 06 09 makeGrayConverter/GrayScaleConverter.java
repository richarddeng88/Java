/**
 * Create a gray scale version of an image by setting all color components of each pixel to the same value.
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.*;

public class GrayScaleConverter {
    //I started with the image I wanted (inImage)
    public ImageResource makeGray(ImageResource inimage) {
        //I made a blank image of the same size
        ImageResource out_image = new ImageResource(inimage.getWidth(), inimage.getHeight());

        //for each pixel in outImage
        for (Pixel pixel : out_image.pixels()) {
            //look at the corresponding pixel in inImage
            Pixel in_pixel = inimage.getPixel(pixel.getX(),pixel.getY());

            //compute inPixel's red + inPixel's blue + inPixel's green
            //divide that sum by 3 (call it average)
            int avg = (in_pixel.getRed()+in_pixel.getBlue()+in_pixel.getGreen())/3 ;
            
            //set pixel's red to average
            pixel.setRed(avg);
            pixel.setBlue(avg);
            pixel.setGreen(avg);
        }
        //outImage is your answer
        return out_image; 
    }
    /*
    public void testGray() {
        ImageResource ir = new ImageResource();
        ImageResource gray = makeGray(ir);
        gray.draw();
    } */
    
    public void select_and_convert(){
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            //System.out.println(f);
            ImageResource infile = new ImageResource(f);
            // get image name and creat a new name
            String fname = infile.getFileName();
			String newName = "gray-" + fname;
			// make the image grey
            ImageResource gray = makeGray(infile);
            gray.draw();    
            // rename the grey image and save
			gray.setFileName(newName);
			gray.draw();
			gray.save();
        }
    }
}
