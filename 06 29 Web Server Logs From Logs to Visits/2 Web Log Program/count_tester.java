
/**
 * Write a description of count_tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class count_tester {
    public void test_counts(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("short-test_log");
        HashMap<String, Integer> counts = la.count_visit_per_ip();
        System.out.println(counts);
    }
}
