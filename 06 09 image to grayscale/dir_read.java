
/**
 * Write a description of dir_read here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class dir_read {
    public void check_dir(){
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            System.out.println(f);
        }
    }
}
