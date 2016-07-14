
/**
 * Write a description of unique_ip_tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;

public class unique_ip_tester {
    public void test(){
        LogAnalyzer test = new LogAnalyzer();
        test.readFile("short-test_log");
        int num = test.count_unique();
        System.out.print("there are " + num + " unique ip address");
    }
    
     public void test_2(){
        LogAnalyzer test = new LogAnalyzer();
        test.readFile("short-test_log");
        int num = test.unique_num();
        System.out.print("there are " + num + " unique ip address");
    }
}


   

