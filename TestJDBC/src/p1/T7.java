package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


public class T7 {
   public static void main(String args[]) {
	   try(Connection con = GetConnection.getConnection();){
			  String sql = "select id,title,price from product";
			  PreparedStatement ps = con.prepareStatement(sql);
			  ResultSet rs =  ps.executeQuery();
			  ResultSetMetaData rsmd =  rs.getMetaData();
		      System.out.println("Total Column : "+rsmd.getColumnCount());	
		      for(int i=1; i<=rsmd.getColumnCount(); i++)
		    	  System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i) +" "+rsmd.getColumnDisplaySize(i));
	     }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
   }
}
