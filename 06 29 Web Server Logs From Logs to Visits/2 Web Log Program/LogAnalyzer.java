
/**
 * Write a description of class LogAnalyzer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import edu.duke.*;

public class LogAnalyzer
{
     private ArrayList<LogEntry> records;
     
     public LogAnalyzer() {
         records = new ArrayList<LogEntry>();
     }
        
     public void readFile(String name) {
         FileResource df = new FileResource();
          for (String f : df.lines()){
             //System.out.println(f);
             LogEntry tem = WebLogParser.parseEntry(f);
             records.add(tem);
         }
     }
     
     private void main(){
         FileResource df = new FileResource();
         
         for (String f : df.lines()){
             //System.out.println(f);
             WebLogParser parse = new WebLogParser();
             LogEntry tem = parse.parseEntry(f);
             records.add(tem);
             System.out.println(parse.parseEntry(f));
         }
     }
        
     public int count_unique(){
         ArrayList<String> uni = new ArrayList<String>();
         //main();
         for (LogEntry le : records){
                String ip = le.getIpAddress();
             if (!uni.contains(ip)){
                 uni.add(ip);
             }
         }
         return uni.size();
     }
     
     public HashMap<String,Integer> count_visit_per_ip(){
         HashMap<String, Integer> counts = new HashMap<String, Integer>();
         //main();
         for (LogEntry le : records){
             String ip = le.getIpAddress();
             if (!counts.containsKey(ip)){
                 counts.put(ip,1); // add a new key and value. 
             }
             else {
                 counts.put(ip,counts.get(ip)+1);
             }
         }
         return counts;
     }    
     
     public int unique_num(){
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        for (LogEntry le : records){
             String ip = le.getIpAddress();
             if (!counts.containsKey(ip)){
                 counts.put(ip,1); // add a new key and value. 
             }
             else {
                 counts.put(ip,counts.get(ip)+1);
             }
         }
         return counts.size();
        }
     public void printAll() {
         main();
         for (LogEntry le : records){
             System.out.println(le);
         }
     }
     
     
}
