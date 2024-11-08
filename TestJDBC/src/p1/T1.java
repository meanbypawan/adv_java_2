package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import dao.ProductDAO;
import model.Product;

public class T1 {
  public static void main(String args[]) {
	  try{
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("enter product title");
		  String title = sc.next();
		  
		  System.out.println("Enter product price");
		  float price  = sc.nextFloat();
	    
		  System.out.println("Enter product brand");
		  String brand = sc.next();
		  
		  Product p = new Product();
		  p.setTitle(title);
          p.setPrice(price);
          p.setBrand(brand);
          
          if(ProductDAO.insert(p))
        	  System.out.println("Record Inserted....");
          else
        	  System.out.println("Something wrong....");
	  }
	    catch(Exception e) {
		  e.printStackTrace();
	    }
  }
}
