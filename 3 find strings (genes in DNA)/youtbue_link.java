import edu.duke.*;
import java.io.*;
/**
read the youtube linke from a urllink, and only print those youtube links.
 */
public class youtbue_link {
    public void readlink(){
        URLResource fr = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String line : fr.lines()) {
            if (line.contains("youtube.com")){
                System.out.println(line);
            }
        } 
    }
    
    public void print_link_source(){
        URLResource fr = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String line : fr.lines()) {
            
                System.out.println(line);
            
        } 
    }
    
}
