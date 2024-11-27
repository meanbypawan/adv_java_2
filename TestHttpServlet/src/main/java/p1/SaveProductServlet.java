package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

import java.io.IOException;
import java.io.PrintWriter;

import dao.ProductDAO;

public class SaveProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SaveProductServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		String price = request.getParameter("price");
		String brand = request.getParameter("brand");
		
		Product p = new Product(title, Float.parseFloat(price), brand);
		if(ProductDAO.save(p))
			response.sendRedirect("add_product.html");
		else
			out.print("Something wrong....");
	}

}
