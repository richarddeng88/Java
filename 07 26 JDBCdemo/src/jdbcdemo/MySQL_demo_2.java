package jdbcdemo;
import java.sql.*;

public class MySQL_demo_2 {


    public static void main(String a[]) throws Exception {
        // 1. Register the JDBC driver: Requires that you initialize a driver so you can open a connection with the database.
        // Registering the dirver is the process by which the driver files are loaded into the memory, so it can....
        // 
        Class.forName("com.mysql.jdbc.Driver");  // oracle.jdbc.driver.OracleDriver
        
        // 2. Open a connection: call the DriverManager.getConnection() method to create a Connection object, 
        // which establishs a physical connection with the database.
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","1234");
        
        // 3. Execute a query: Requires using an object of type Statement for building and submitting an SQL statement 
        // to the database.
        Statement stat = conn.createStatement(); // the statement is sent to the DB server each and every tim.        
        stat.execute("drop table test");
        stat.execute("create table test(id int primary key, name varchar(255))");
        stat.execute("insert into test values(2, 'Joy'),(3,'richard'),(4,'yunyun'),(5,'Tony')");
        
        // 4. Extract data from result set: Requires that you use the appropriate ResultSet.getXXX() method to retrieve 
        // the data from the result set.
        ResultSet rs;
        rs = stat.executeQuery("select * from test");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
        
        //5 close the environment. 
        stat.close();
        conn.close();
    }
    
}
