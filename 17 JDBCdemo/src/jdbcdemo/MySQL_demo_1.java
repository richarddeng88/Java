package jdbcdemo;

//STEP 1. Import required packages
import java.sql.*;

public class MySQL_demo_1 {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/employees?autoReconnect=true&useSSL=false";//set SSL false

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "1234";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      //stmt.execute("insert into test values(6, 'Jo0y'),(7,'ric0hard'),(8,'y0unyun')");
      String sql = "select * from test";
      
       //STEP 5: Extract data from result set
       try (ResultSet rs = stmt.executeQuery(sql)) {
           //STEP 5: Extract data from result set
           while (rs.next()) {  
               //Retrieve by column name
               int id  = rs.getInt("id");
               String age = rs.getString("name");
               //String first = rs.getString("first");
               //String last = rs.getString("last");
               System.out.println("ID: " + id+ ", Age: " + age);
               

           }
           //STEP 6: Clean-up environment
       }
      stmt.close();
      conn.close();
   }catch(SQLException se){
   }catch(Exception e){
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end MySQL_demo_1