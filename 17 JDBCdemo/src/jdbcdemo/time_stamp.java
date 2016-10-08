/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcdemo;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.*;

public class time_stamp {
   public static void main(String[] args) {
      //Get standard date and time
      java.util.Date javaDate = new java.util.Date();
      long javaTime = javaDate.getTime(); // .getTime() return the int number
      System.out.println("The Java Date is:" + 
             javaDate.toString());
      System.out.println("The Java Time is:" + 
             javaTime);

      //Get and display SQL DATE
      java.sql.Date sqlDate = new java.sql.Date(javaTime);
      System.out.println("The SQL DATE is: " + 
             sqlDate.toString());

      //Get and display SQL TIME
      java.sql.Time sqlTime = new java.sql.Time(javaTime);
      System.out.println("The SQL TIME is: " + 
             sqlTime.toString());
      //Get and display SQL TIMESTAMP
      java.sql.Timestamp sqlTimestamp =
      new java.sql.Timestamp(javaTime);
      System.out.println("The SQL TIMESTAMP is: " + 
             sqlTimestamp.toString());
     }//end main
}//end SqlDateTime