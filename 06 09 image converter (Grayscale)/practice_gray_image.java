
/**
 * Write a description of practice_gray_image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.*;
public class practice_gray_image {
    public ImageResource make_grey(ImageResource image){
        ImageResource out_image = new ImageResource(image.getWidth(), image.getHeight());
        for (Pixel p : out_image.pixels()){
            int x = p.getX();
            int y = p.getY();
            Pixel pixel = image.getPixel(x,y);
            int avg = pixel.getRed()/3 + pixel.getGreen()/3 + pixel.getBlue()/3;
            p.setRed(avg);
            p.setGreen(avg);
            p.setBlue(avg);
        }
        return out_image;
    }
    
    public void main(){
        //FileResource df = new FileResource();
        //ImageResource output = new ImageResource(df);
        DirectoryResource df = new DirectoryResource();
        for (File f : df.selectedFiles()){
            ImageResource input = new ImageResource(f);
            ImageResource output = make_grey(input);
            String name = input.getFileName();
            String new_name = "grey-" + name;
            output.setFileName(new_name);
            output.draw();
            output.save();
        }
    }
    
}
