
/**
 * Write a description of practices here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import org.apache.commons.csv.*;

public class practices {
    // a method without return, implement a ...
    private void list(CSVParser df, String interest){
        //int num = 0;
        for (CSVRecord record : df){
            String export = record.get("Exports");
            
            if (export.contains(interest)){
                System.out.println(record.get("Country"));
                //num += 1;
                //System.out.println(num);
            }
        }
    }
    
    private void list_two_products(CSVParser df, String p1, String p2){
        for (CSVRecord record : df){
            String export = record.get("Exports");
            if (export.contains(p1) && export.contains(p2)){
                System.out.println(record.get("Country"));
            }
        }
    }
    
    private void country_info(CSVParser df, String country){
        for (CSVRecord record :df) {
            String name = record.get("Country");
            if (name.equals(country)){
                System.out.println(country + " : " +record.get("Exports")+ " : "+record.get("Value (dollars)"));               
            }
            //else {System.out.println("NOT FOUND!");}
        }
    }
    
    private int num_of_country(CSVParser df, String item){
        int number = 0;
        for (CSVRecord record :df){
            String export = record.get("Exports");
            if (export.contains(item)){
                System.out.println(record.get("Country"));
                number += 1;
            }
        }
        return number;
    }
        
    public void who_export_coffee(){
        FileResource fr = new FileResource();
        CSVParser df = fr.getCSVParser();
        //list(df, "coffee");
        int num = num_of_country(df,"coffee");
        System.out.println("the total number is " + num);
    }
    
    public void who_export_coffee_and_tea(){
        FileResource fr = new FileResource();
        CSVParser df = fr.getCSVParser();
        list_two_products(df, "coffee","tea");
    }
    
    public void find_country_info(){
        FileResource fr = new FileResource();
        CSVParser df = fr.getCSVParser();
        country_info(df, "Germany");
    }
}
