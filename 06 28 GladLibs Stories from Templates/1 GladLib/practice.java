
/**
 * Write a description of practice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.lang.*;
import edu.duke.*;

public class practice {
    private ArrayList<String> adj_list;
    private ArrayList<String> noun_list;
    private ArrayList<String> color_list;
    private ArrayList<String> country_list;
    private ArrayList<String> name_list;
    private ArrayList<String> animal_list;
    private ArrayList<String> time_list;
    
    private Random my_random;
    // class Random is from java.util. 
    //An instance of this class is used to generate a stream of pseudorandom numbers
    
    private static String data_url = "http://dukelearntoprogram.com/course3/data";
    private static String data_dir = "data";
    
    // define a new method
    // to read the content of files into arraylist. 
    private void initializeFromSource(String source){
        adj_list = readIt(source+"/adjective.txt");
        noun_list = readIt(source + "/noun.txt");
        color_list = readIt(source+"/color.txt");
        country_list = readIt(source+"/country.txt");
        name_list = readIt(source+"/name.txt");     
        animal_list = readIt(source+"/animal.txt");
        time_list = readIt(source+"/timeframe.txt");    
    }
    
    private ArrayList<String> readIt(String source){
        ArrayList<String> list = new ArrayList<String>();
        
        FileResource resource = new FileResource(source);
        for (String line : resource.lines()){
            list.add(line);
        }
        
        return list;
    }
    
    // below is two constructor. 
    public practice(){
        initializeFromSource(data_dir);
        my_random = new Random();
    }
    
    public practice(String source){
        initializeFromSource(source);
        my_random = new Random();
    }
    
    // make a method, to get random word from each arraylist
    private String get_substitute(String label){
        if (label.equals("country")){
            return randomFrom(country_list);
        }
        if (label.equals("color")){
            return randomFrom(color_list);
        }
        if (label.equals("noun")){
			return randomFrom(noun_list);
		}
		if (label.equals("name")){
			return randomFrom(name_list);
		}
		if (label.equals("adjective")){
			return randomFrom(adj_list);
		}
		if (label.equals("animal")){
			return randomFrom(animal_list);
		}
		if (label.equals("timeframe")){
			return randomFrom(time_list);
		}
		if (label.equals("number")){
			return ""+ my_random.nextInt(50)+5;
		}
        return "**UNKNOWN**";
    }
    
    private String randomFrom(ArrayList<String> source){
        int index = my_random.nextInt(source.size());
        // .nextInt(int n): returns a random, uniformly distributed in value between 0 and int n. 
        return source.get(index);
        
    }
    
    // processing the words
    private String process(String w){
        int first = w.indexOf("<");
        int last = w.indexOf(">", first);
        if (first == -1 || last == -1){
            return w;
        }
        //String prefix = w.substring(0,first); //begining and ending index
        //String suffix = w.substring(last +1); // begining index
        String sub = get_substitute(w.substring(first+1, last));
        return sub;
    }
    
    public void test(String w){
        int first = w.indexOf("<");
        int last = w.indexOf(">", first);
        if (first == -1 || last == -1){
            System.out.print(w);
        }
        String prefix = w.substring(0,first); //begining and ending index
        String suffix = w.substring(last +1); // begining index
        String sub = get_substitute(w.substring(first+1, last));
       
        System.out.print(prefix + sub + suffix);
    }

    
    private String from_template(String source){
        String story = "";
        FileResource resource = new FileResource(source);
        for (String word : resource.words()){
            story = story + process(word) + " ";
            System.out.print(process(word) + " ");
        }
        
        return story;
    }
    
    private void print_out(String s, int line_width){
        int chart = 0 ;
        for (String w : s.split("\\s+")){
            // "\\s+" : matches sequence of one or more whitespace characters. 
            // In computer science, white space is any character or series of characters that represent horizontal or vertical space in typography
            if (chart + w.length() >line_width){
                System.out.println();
                chart=0;
            }
            System.out.print(w+ "          ");
            chart += w.length() + 1;
        }
        System.out.print(s.split("\\s+"));
    }
    
    
    public void make_story(){
        //System.out.println("\n");
        //System.out.println("\n");
        String story = from_template("data/madtemplate.txt");
        print_out(story, 50);
    }
    
}
