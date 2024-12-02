package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.StringJoiner;

import model.Product;
import model.Review;
import service.GetConnection;

public class ProductDAO {
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
