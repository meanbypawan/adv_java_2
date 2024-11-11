package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class T5 {
  public static void main(String args[]) {
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from product";
		  PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE);
		  ResultSet rs =  ps.executeQuery();
		  rs.absolute(1);
		  //rs.relative(1);
		  while(rs.next()) {
	    	  int id = rs.getInt(1);
	    	  String title = rs.getString(2);
	    	  float price = rs.getFloat(3);
	          System.out.println(id+" "+title+" "+price);
	      }
		  /*
		  rs.afterLast();
	      while(rs.previous()) {
	    	  int id = rs.getInt(1);
	    	  String title = rs.getString(2);
	    	  float price = rs.getFloat(3);
	          System.out.println(id+" "+title+" "+price);
	      }
	      */
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
