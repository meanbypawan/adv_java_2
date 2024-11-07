package p1;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TestInsert {
   public static void main(String args[]) {
	   Connection con = null;
	   try {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("Enter product title");
		   String productTitle = sc.next();
		   
		   System.out.println("Enter product price");
		   String price = sc.next();
		   
		   System.out.println("Enter product brand");
		   String brand = sc.next();
		   
		   String sql = "insert into product(title,price,brand) values('"+productTitle+"',"+price+",'"+brand+"')";
	       con = GetConnection.getConnection();
	       Statement st =  con.createStatement();
	       int x = st.executeUpdate(sql);
	       if(x!=0) {
	    	   System.out.println("Record inserted : "+x);
	       }
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   finally {
		   try {
			   con.close();
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
	   }
   }
}
