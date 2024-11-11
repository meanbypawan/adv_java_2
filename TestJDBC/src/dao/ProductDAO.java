package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Product;
import p1.GetConnection;

public class ProductDAO {
  public static Product get(int id) {
	  Product p = null;
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from product where id = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setInt(1, id);
		  ResultSet rs = ps.executeQuery();
		  if(rs.next()) {
			String title = rs.getString("title");
			float price = rs.getFloat("price");
			String brand = rs.getString("brand");
			
			p = new Product(id, title, price, brand);
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return p;
  }
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
  public static boolean delete(int id) {
    try(Connection con = GetConnection.getConnection();){
    	String sql = "delete from product where id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        if(ps.executeUpdate()!=0)
        	return true;
    }
    catch(Exception e) {
    	e.printStackTrace();
    }
    return false;
  }
  public static boolean update(Product p) {
	  try(Connection con  = GetConnection.getConnection();){
		  String sql = "update product set title = ?, price = ?, brand = ? where id = ?";
		  // update product set title 'Pen-drive', price = 450, brand = 'scandisk' where id = 4
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setString(1, p.getTitle());
		  ps.setFloat(2, p.getPrice());
		  ps.setString(3, p.getBrand());
		  ps.setInt(4, p.getId());
		  if(ps.executeUpdate()!=0)
			  return true;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return false;
  }
  
  public static ArrayList<Product> select() {
	 ArrayList<Product> al = new ArrayList<Product>(); 
   	 try(Connection con = GetConnection.getConnection();){
   		 String sql = "select * from product";
   		 PreparedStatement ps = con.prepareStatement(sql);
   		 ResultSet rs =  ps.executeQuery();
   		 while(rs.next()) {
   			 int id = rs.getInt(1);
   			 String title = rs.getString(2);
   			 float price = rs.getFloat(3);
   			 String brand = rs.getString(4);
   			 Product p = new Product(id, title, price, brand);
   		     al.add(p);
   		 }
   	 }
   	 catch(Exception e) {
   		 e.printStackTrace();
   	 }
   	 return al;
  }
}













