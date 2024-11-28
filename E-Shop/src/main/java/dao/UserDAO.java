package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.User;
import service.GetConnection;

public class UserDAO {
   public static boolean save(User user) {
	   boolean status = false;
	   try (Connection con = GetConnection.getConnection();){
		   String sql = "insert into user(name,email,contact,password) values(?,?,?,?)";
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setString(1, user.getName());
		   ps.setString(2, user.getEmail());
	       ps.setString(3, user.getContact());
	       ps.setString(4, user.getPassword());
	       if(ps.executeUpdate()!=0)
	    	   status = true;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
	   }
	   return status;
   }
}
