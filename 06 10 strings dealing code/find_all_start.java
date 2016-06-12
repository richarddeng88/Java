import edu.duke.*;
import java.io.*;

/**
 * Write a description of find_all_start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class find_all_start {
    
    
    public void print_all_start(String df){
        int start = 0;
        while (true){
            int loc = df.indexOf("atg",start);
            if (loc== -1){
                break;
            }
            System.out.println("start at " + loc);
            start = loc+3;
        }
            
    }
    
    public int find_stop_index(String df, int index){
        int stop1 = df.indexOf("tga",index);
        if (stop1 == -1 || (stop1 - index)% 3 != 0 ){
            stop1 = df.length();
        }
        
        int stop2 = df.indexOf("tga",index);
        if (stop2 == -1 || (stop2 - index)% 3 != 0 ){
            stop2 = df.length();
        }
        
        int stop3 = df.indexOf("tga",index);
        if (stop3 == -1 || (stop3 - index)% 3 != 0 ){
            stop3 = df.length();
        }
        
        return Math.min(stop1, Math.min(stop2, stop3));
    }
}
