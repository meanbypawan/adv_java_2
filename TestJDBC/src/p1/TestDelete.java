package p1;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TestDelete {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter product id");
		 String id = sc.nextLine();
	     // id: 1 ==> delete from product where id = 1 or id != 1
		 String sql = "delete from product where id ="+id;
	     Statement st = con.createStatement();
	     int x = st.executeUpdate(sql);
	     if(x!=0)
	    	 System.out.println("Record Deleted : "+x);
	     else
	    	 System.out.println("Record Not Found : "+x);
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
