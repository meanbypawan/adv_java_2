package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import dao.ProductDAO;

public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteProductServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      PrintWriter out = response.getWriter();
	  String id = request.getParameter("id");
      if(ProductDAO.delete(Integer.parseInt(id))) {
    	  response.sendRedirect("./ViewProductServlet");
      }
      else
    	out.print("Oops! Something went wrong....");  
    	  
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
