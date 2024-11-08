package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestInsertUsingPS {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();){
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter product title");
		  String title = sc.next();
		  
		  System.out.println("Enter product price");
		  float price  = sc.nextFloat();
	    
		  System.out.println("Enter product brand");
		  String brand = sc.next();
		  
		  //                                                          1 2 3 
		  String sql = "insert into product(title,price,brand) values(?,?,?)";
		  PreparedStatement ps =  con.prepareStatement(sql);
		  ps.setString(1,title);
		  ps.setFloat(2, price);
		  ps.setString(3, brand);
	      int x = ps.executeUpdate();
	      if(x!=0)
	    	  System.out.println("Record inserted....");
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
