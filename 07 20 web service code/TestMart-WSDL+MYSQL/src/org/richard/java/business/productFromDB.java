package org.richard.java.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class productFromDB {

	public productFromDB()  {  }
	            
	public String get_product_detail(){
		String a = "ggggg";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "1234");
	        Statement stat = conn.createStatement();
	        ResultSet rs = stat.executeQuery("select catalog from product");
	        rs.next();
            a = rs.getString(1);
            stat.close();
            conn.close();
		}catch (Exception ex){
			a = "No Access to MySQL";
			System.out.println("there is something wrong");
			ex.printStackTrace(System.out);
		} finally{
			System.out.println("good luck for you, richard!!!!");
		}
		return a;
	}

	public boolean add_product_to_DB(int sku, String name, String detail){
		boolean a = false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "1234");
	        Statement stat = conn.createStatement();
	        //String query = "insert into product values (" + sku +",'"+ name +"','" + detail+"'" +")";
	        //stat.execute(query);
	        String q1 = "insert into product values(107, 'book2','refdssion')";
	        stat.execute(q1); 
            
	        stat.close();
            conn.close();
            a = true;
		}catch (Exception ex){
			System.out.println("fail to add new product info to DB");
		} finally{
			System.out.println("good luck for you, richard!!!!");
		}
		return a;
	}
	
	public static void main(String a[]) {
		productFromDB dd = new productFromDB();
		dd.get_product_detail();
	}
}
