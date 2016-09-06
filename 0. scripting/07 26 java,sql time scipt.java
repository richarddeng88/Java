import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.*;

public class time_stamp{
	public static void main(String[] args){
		// get the standar time and date of java
		java.util.Date javaDate = new java.util.Date();
		long javaTime = javaDate.getTime();
		System.out.println(javaDate.toString());

		// get SQL DATE
		java.sql.Date sqlDate = new java.sql.Date(javaTime);
		System.out.println(sqlDate);

		//get SQL time
		java.sql.Time sqlTime = new java.sql.Time(javaTime);
		System.out.println(sqlTime);

		// get and display sql timestamp
		java.sql.Timestamp sqlTimeStamp - new java.sql.Timestamp(javaTime);
		System.out.println(sqlTimeStamp.toString())

	}

}