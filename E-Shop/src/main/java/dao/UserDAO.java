package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import service.GetConnection;

public class UserDAO {
   public static User authenticate(User user) {
	   User u = null;
	   try(Connection con = GetConnection.getConnection();) {
		  String sql = "select * from user where email = ? and password = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, user.getEmail());
		  ps.setString(2, user.getPassword());
		  ResultSet rs =  ps.executeQuery();
	      if(rs.next()) {
	    	  u = new User();
	    	  u.setId(rs.getInt("id"));
	    	  u.setEmail(rs.getString("email"));
	    	  u.setContact(rs.getString("contact"));
	    	  u.setName(rs.getString("name"));
	      }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return u; 
   }
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
