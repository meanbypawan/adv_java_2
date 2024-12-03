package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

import model.Product;
import model.Review;
import service.GetConnection;

public class ProductDAO {
  public static Product getProduct(int id) {
	  Product p = null;
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from product where id = ?";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ps.setInt(1, id);
		  ResultSet rs =  ps.executeQuery();
	      if(rs.next()) {
	    	  String title= rs.getString("title");
	    	  float price = rs.getFloat("price");
	    	  String description = rs.getString("description");
	    	  String category  =rs.getString("category");
	    	  float discountPercentage = rs.getFloat("discountPercentage");
	    	  float rating  = rs.getFloat("rating");
	    	  int stock = rs.getInt("stock");
	    	  String brand = rs.getString("brand");
	    	  String warrantyInformation =rs.getString("warrantyInformation");
	    	  String shippingInformation = rs.getString("shippingInformation");
	    	  String availabilityStatus = rs.getString("availabilityStatus");
	    	  String images = rs.getString("images");
	          String imagesArray[] = images.split(",");
	          ArrayList<String>imageList = new ArrayList<String>();
	          for(String url : imagesArray)
	           imageList.add(url);	    
	          String thumbnail = rs.getString("thumbnail");
	          
	          String sql2 = "select * from review where productId="+id;
	          PreparedStatement ps2 = con.prepareStatement(sql2);
	          ResultSet rs2 = ps2.executeQuery();
	          ArrayList<Review> reviewList = new ArrayList<Review>();
	          while(rs2.next()) {
	        	  int reviewId = rs2.getInt("id");
	        	  int reviewRating = rs2.getInt("rating");
	        	  String comment = rs2.getString("comment");
	        	  String date = rs2.getString("date");
	        	  String reviewerName = rs2.getString("reviewerName");
	        	  String reviewerEmail = rs2.getString("reviewerEmail");
	        	  int productId =id;
	        	  Review review = new Review(reviewId, reviewRating, comment, date, reviewerName, reviewerEmail, productId);
	              reviewList.add(review);
	          }
	          p = new Product(id, title, description, category, price, discountPercentage, rating, stock, brand, warrantyInformation, shippingInformation, availabilityStatus, imageList, reviewList, thumbnail);
	      }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return p;
  }
  public static ArrayList<Product> getProductList(){
	  ArrayList<Product> al = new ArrayList<Product>();
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "select * from product";
		  PreparedStatement ps = con.prepareStatement(sql);
		  ResultSet rs =  ps.executeQuery();
	      while(rs.next()) {
	    	  int id = rs.getInt(1);
	    	  String title= rs.getString("title");
	    	  float price = rs.getFloat("price");
	    	  String description = rs.getString("description");
	    	  String category  =rs.getString("category");
	    	  float discountPercentage = rs.getFloat("discountPercentage");
	    	  float rating  = rs.getFloat("rating");
	    	  int stock = rs.getInt("stock");
	    	  String brand = rs.getString("brand");
	    	  String warrantyInformation =rs.getString("warrantyInformation");
	    	  String shippingInformation = rs.getString("shippingInformation");
	    	  String availabilityStatus = rs.getString("availabilityStatus");
	    	  String images = rs.getString("images");
	          String imagesArray[] = images.split(",");
	          ArrayList<String>imageList = new ArrayList<String>();
	          for(String url : imagesArray)
	           imageList.add(url);	    
	          String thumbnail = rs.getString("thumbnail");
	          
	          Product p = new Product(id, title, description, category, price, discountPercentage, rating, stock, brand, warrantyInformation, shippingInformation, availabilityStatus, imageList, null, thumbnail);
	          al.add(p);
	      }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return al;
  }
  public static boolean save(ArrayList<Product> al) {
	  boolean status = false;
	  try(Connection con = GetConnection.getConnection();){
		  String sql = "insert into product(id,title,description,category,price,discountPercentage,rating,stock,brand,warrantyInformation,shippingInformation,availabilityStatus,images,thumbnail) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		  PreparedStatement ps1 = con.prepareStatement(sql);
		  for(Product p : al) {
			  ps1.setInt(1, p.getId());
			  ps1.setString(2, p.getTitle());
			  ps1.setString(3, p.getDescription());
			  ps1.setString(4, p.getCategory());
			  ps1.setFloat(5, p.getPrice());
			  ps1.setFloat(6, p.getDiscountPercentage());
			  ps1.setFloat(7, p.getRating());
			  ps1.setInt(8, p.getStock());
			  ps1.setString(9, p.getBrand());
			  ps1.setString(10, p.getWarrantyInformation());
			  ps1.setString(11, p.getShippingInformation());
			  ps1.setString(12, p.getAvailabilityStatus());
			  String images = "";
			  StringJoiner sj = new StringJoiner(",");
			  for(String url : p.getImages())
				  sj.add(url);
			  images = sj.toString();
		      ps1.setString(13, images);
		      ps1.setString(14, p.getThumbnail());
		      if(ps1.executeUpdate()==0)
		    	  return false;
		      ArrayList<Review> reviewList =  p.getReviews();
		      String sql2 = "insert into review(rating,comment,date,reviewerName,reviewerEmail,productId) values(?,?,?,?,?,?)";
		      PreparedStatement ps2 = con.prepareStatement(sql2);
		      for(Review r : reviewList) {
		    	  ps2.setInt(1, r.getRating());
		    	  ps2.setString(2, r.getComment());
		    	  ps2.setString(3, r.getDate());
		    	  ps2.setString(4, r.getReviewerName());
		    	  ps2.setString(5, r.getReviewerEmail());
		    	  ps2.setInt(6, p.getId());
		    	  if(ps2.executeUpdate() == 0)
		    		  return false;
		      }
		      
		  }
		  status = true;
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return status;
  }
}
