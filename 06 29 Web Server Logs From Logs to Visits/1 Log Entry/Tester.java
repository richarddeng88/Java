
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void test_practice1(){
        practice_log_entry info = new practice_log_entry("192.168.1.188", new Date(),"example",200,500);
        System.out.println(info);
        String log = info.toString();//to string method return the log info we type before. 
        System.out.println(info.toString());
        System.out.println(info.getAccessTime());
        System.out.println(info.getIp());
    }
    public void testLogAnalyzer() {
        // complete method
    }
}
