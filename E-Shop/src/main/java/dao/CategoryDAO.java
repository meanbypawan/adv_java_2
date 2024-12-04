package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import model.Category;
import service.GetConnection;

public class CategoryDAO {
	
   public static boolean saveInBulk(ArrayList<Category> al) {
	   boolean status  = false;
	   Connection con = null;
	   try{
		   String sql = "insert into category(name,slug,url) values(?,?,?)";
		   con = GetConnection.getConnection();
		   PreparedStatement ps = con.prepareStatement(sql);
		   for(Category c : al) {
			   ps.setString(1,c.getName());
			   ps.setString(2, c.getSlug());
			   ps.setString(3, c.getUrl());
			   if(ps.executeUpdate()==0)
			     return false;
		   }
		   status = true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return status;
   }
}
