
/**
 * Write a description of practices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import org.apache.commons.csv.*;

public class practices {
    public void read_file(){
        FileResource fr = new FileResource();
        CSVParser df = fr.getCSVParser();
        for (CSVRecord record : df){
            System.out.print(record.get("Name")+ " " );
            System.out.println(record.get("Favorite Food"));
        }
    }
}
