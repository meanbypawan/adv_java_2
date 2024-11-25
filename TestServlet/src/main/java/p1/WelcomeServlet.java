package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WelcomeServlet implements Servlet{
    ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;  
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
       PrintWriter out = response.getWriter();
       out.print("<h1>Welcome in servlet</h1>");
	   String d3 = getServletConfig().getInitParameter("d3");
	   out.print(d3);
	   
	   ServletContext context =  config.getServletContext();
	   String D = context.getInitParameter("D");
	   out.print("<br/>"+D);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

   
}
