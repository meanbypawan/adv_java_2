package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Product;
import p1.GetConnection;

public class ProductDAO {
  public static boolean insert(Product p) {
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "insert into product(title,price,brand) values(?,?,?)";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1,p.getTitle());
		  ps.setFloat(2, p.getPrice());
		  ps.setString(3, p.getBrand());
		  if(ps.executeUpdate()!=0)
			  return true;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return false;
  }
  public static void delete(int id) {}
  public static void update(Product p) {}
  public static void select() {}
}
