
/**
 * Write a description of practice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
// the gen starts with "ATG" , ends with "TAG", 'TAA','TGA'.

public class practice {
    
    // find the first piece of gene in a NDA DOCUMENT. 
    private String find_gene(String dna){
        dna.toLowerCase();
        int start = dna.indexOf("atg");
        if (start == -1) {
            return "We didn't find a gene.";
        }
        
        int end = dna.indexOf("tag", start+3);
        if ((end - start) % 3 == 0) {
            //System.out.println(" we found a gene - " + dna.substring(start, end +3));
            return (" we found a gene - " + dna.substring(start, end +3));
        }
        else {return "We didn't find a gene." ;}
       
    }
    
    public void find_gene(){
        DirectoryResource df = new DirectoryResource();
        for (File f : df.selectedFiles()) {
            FileResource fr = new FileResource(f);
            String s = fr.asString();
            System.out.println("read" + s.length() + " charaters");
            String result = find_gene(s);
            System.out.println(" the result is: " + result) ;
        }
    }
    
    // if considering all three ending situation, write code to find all the genes.
    // a method to find where to stop for a piece. "TAG", 'TAA','TGA'.
    private int find_stop_index (String df, int start) {
        df.toLowerCase();
        int stop_tga = df.indexOf("tga", start);
        if (stop_tga == -1 || (stop_tga - start)%3 != 0){
            stop_tga = df.length();
        }
        
        int stop_tag = df.indexOf("tag", start);
        if (stop_tag ==-1 || (stop_tag-start)%3 != 0) {
            stop_tag = df.length();
        }
        
        int stop_taa = df.indexOf("taa", start);
        if (stop_taa == -1 || (stop_taa - start)%3 != 0 ){
            stop_taa = df.length();
        }
        return Math.min(stop_tga, Math.min(stop_taa, stop_tag));
    }
    
    public void find_all_genes(){
        DirectoryResource df = new DirectoryResource();
        for (File f : df.selectedFiles()) {
            FileResource fr = new FileResource(f);
            String s = fr.asString();
            System.out.println("read " + s.length() + " charaters");
            //String result = find_gene(s);
            //System.out.println(" the result is: " + result) ;
            int start = 0 ; int count = 0;
            while (true) {
                int atg = s.indexOf("atg", start);
                if (atg == -1){
                    System.out.println("end.");
                    break;
                }
                int end = find_stop_index(s,start+3);
                if (end != s.length()){
                    count += 1;
                    System.out.println(count + "  " + s.substring(start, end+3));
                    start = end + 3;
                    
                }
                else{
                    System.out.print("all genes have been print out. ");
                    start = end + 3;
                }
            }
            
        }
    }
}

















