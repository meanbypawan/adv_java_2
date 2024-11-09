package p1;

import dao.ProductDAO;
import model.Product;

public class T4 {
   public static void main(String  args[]) {
	   Product p =  ProductDAO.get(2);
	   if(p!=null)
         System.out.println(p.getId()+"  "+p.getTitle()+"  "+p.getPrice()+"  "+p.getBrand());
   }
}
