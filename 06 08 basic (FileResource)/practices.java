
/**
 * Write a description of File_Resource here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.File;

public class practices {
    public void main(){
        FileResource df = new FileResource();
        for (String f : df.lines()){
            System.out.println(f);
        }

    }
    
    public void url(){
        URLResource df = new URLResource("http://wsj.com");
        for (String f : df.lines()){
            System.out.println(f);
        }
    }
    
    public void dir_reader(){
        DirectoryResource df = new DirectoryResource();
        for (File f : df.selectedFiles()){
            System.out.println(f);//print out the directory path;
        }
    }
}


