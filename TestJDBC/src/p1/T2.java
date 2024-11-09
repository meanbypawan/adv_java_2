package p1;

import java.util.ArrayList;

import dao.ProductDAO;
import model.Product;

public class T2 {
   public static void main(String args[]) {
	  ArrayList<Product> al = ProductDAO.select();
      for(Product p : al)
    	  System.out.println(p.getId()+"  "+p.getTitle()+"  "+p.getPrice()+"  "+p.getBrand());
   }
}
