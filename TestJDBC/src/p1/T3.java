package p1;

import java.util.Scanner;

import dao.ProductDAO;
import model.Product;

public class T3 {
  public static void main(String  args[]) {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter title");
	  String title = sc.next();
	  
	  System.out.println("Enter price");
	  float price = sc.nextFloat();
	  
	  System.out.println("Enter brand");
	  String brand = sc.next();
	  
	  System.out.println("Enter id");
	  int id = sc.nextInt();
      
	  Product p = new Product(id, title, price, brand);
	  if(ProductDAO.update(p)){
		  System.out.println("Record updated....");
	  }
	  else
		  System.out.println("Something wrong....");
  }
}
