
/**
 * Write a description of practics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.util.ArrayList;

public class practices {
    private ArrayList<String> my_words;
    private ArrayList<Integer> my_freqs;
    
    public practices() {
        my_words = new ArrayList<String>();
        my_freqs = new ArrayList<Integer>();    
    }
    
    public void find_unique(){
        FileResource article = new FileResource();
        
        for (String s : article.words()){
            s = s.toLowerCase();
            int index = my_words.indexOf(s);
            if (index == -1) {
                my_words.add(s);
                my_freqs.add(1);
            }
            else {
                int freq = my_freqs.get(index);
                my_freqs.set(index, freq+1);
            }
        }
        
        System.out.println("# of unique words are "+my_words.size());
        System.out.println(my_freqs);

    }
    
    public void test_method(){
        find_unique();
        for (int k=0 ;k<my_words.size();k++){
            System.out.println(my_words.get(k)+" " + my_freqs.get(k));
        }    
    }
    
    // find the most frequent used word. 
    public int find_max(){
        int max = my_freqs.get(0);
        int maxIndex = 0;
        for (int k=0; k < my_freqs.size(); k++){
            if(my_freqs.get(k) > max){
                max = my_freqs.get(k);
                maxIndex = k;
            }
        }
    }
    
    
    
}
