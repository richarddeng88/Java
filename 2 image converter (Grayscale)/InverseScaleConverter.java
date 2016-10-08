import edu.duke.*;
import java.io.*;

public class InverseScaleConverter {
    //I started with the image I wanted (inImage)
    public ImageResource makeInverse(ImageResource inimage) {
        //I made a blank image of the same size
        ImageResource out_image = new ImageResource(inimage.getWidth(), inimage.getHeight());

        //for each pixel in outImage
        for (Pixel pixel : out_image.pixels()) {
            //look at the corresponding pixel in inImage
            Pixel in_pixel = inimage.getPixel(pixel.getX(),pixel.getY());

            //compute inPixel's red + inPixel's blue + inPixel's green
            //divide that sum by 3 (call it average)
            int red = 255 - in_pixel.getRed();
            int blue = 255 - in_pixel.getBlue();
            int green = 255 - in_pixel.getGreen();
            //set pixel's red to average
            pixel.setRed(red);
            pixel.setBlue(blue);
            pixel.setGreen(green);
        }
        //outImage is your answer
        return out_image; 
    }
    /*
    public void testInverse() {
        ImageResource ir = new ImageResource();
        ImageResource gray = makeInverse(ir);
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
            ImageResource gray = makeInverse(infile);
            gray.draw();    
            // rename the grey image and save
			gray.setFileName(newName);
			gray.draw();
			gray.save();
        }
    }
}