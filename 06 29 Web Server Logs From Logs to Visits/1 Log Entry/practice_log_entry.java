
/**
 * Write a description of practice_log_entry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class practice_log_entry {
    private String ip_address;
    private Date access_time;
    private String request;
    private int status;
    private int bytes_returned;
    
    // notice that below method is a constructer. (same name with class name)
    public practice_log_entry(String ip, Date time, String req, int status, int bytes){
       ip_address = ip;
       access_time = time;
       request = req;
       this.status = status;
       bytes_returned = bytes;
    }
    
    public String getIp(){
        return ip_address;
    }
    
    public Date getAccessTime(){
        return access_time;
    }
    
    public String getRequest(){
        return request;
    }
    
    public int getStatus(){
        return status;
    }
    
    public int getBytes(){
        return bytes_returned;
    }
    
    // notice:::::
    // every class has toString() method by default.  otherwise, it will print the memory path
    public String toString(){
        return ip_address + " " + access_time + " " + request + " " + status + " " +
        bytes_returned;
    }
}


