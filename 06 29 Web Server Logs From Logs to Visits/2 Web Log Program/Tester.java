
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
        //System.out.println("the ip is " + le.getIpAddress());
        
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
        
        LogEntry le3 = new LogEntry("192.168.100.4", new Date(), "example request 3", 200, 640);
        System.out.println(le3);
    }
    
    public void testLogAnalyzer() {
        // complete method
    }
}
