package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class T6 {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from product";
		  PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		  ResultSet rs =  ps.executeQuery();
		  while(rs.next()) {
	    	  int id = rs.getInt(1);
	    	  String title = rs.getString(2);
	    	  if(id == 3) {
	    		  rs.updateFloat("price", 5000);
	    		  rs.updateRow();
	    	  }
	    	  float price = rs.getFloat(3);
	    	  
	          System.out.println(id+" "+title+" "+price);
	      }
		  
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
