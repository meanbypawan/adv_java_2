package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
   private static Connection con;	
   public static Connection getConnection() {
	  try { 
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch530?useSSL=false","root","root");
	   System.out.println("Database Connected.....");
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	   return con;
   }
}