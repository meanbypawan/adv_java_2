package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import dao.ProductDAO;
public class ViewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ViewProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 ArrayList<Product>al =  ProductDAO.getProductList();
	 PrintWriter out = response.getWriter();
	 out.print("<html>");
	 out.print("<body>");
	 out.print("<table width='100%' border='1'>");
	 out.print("<tr>");
	 out.print("<td>S.no</td>");
	 out.print("<td>Title</td>");
	 out.print("<td>Price</td>");
	 out.print("<td>Brand</td>");
	 out.print("<td>Delete</td>");
	 out.print("</tr>");
	 int index =1;
	 for(Product p : al) {
		 out.print("<tr>");
		 out.print("<td>"+index+"</td>");
		 out.print("<td>"+p.getTitle()+"</td>");
		 out.print("<td>"+p.getPrice()+"</td>");
		 out.print("<td>"+p.getBrand()+"</td>");
		 out.print("<td><a href='./DeleteProductServlet?id="+p.getId()+"'><button>Delete</button></a></td>");
		 out.print("</tr>");
		 index++;
	 }
	 out.print("</table>");
	 out.print("</body>");
	 out.print("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
