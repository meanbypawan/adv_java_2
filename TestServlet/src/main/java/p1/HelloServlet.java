package p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class HelloServlet implements Servlet {
    ServletConfig config;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
        System.out.println("Init Called.........");
	    this.config = config; 
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
      System.out.println("Service called.....");
      PrintWriter out = response.getWriter();
      out.print("<h1>Welcome in java web world.....</h1>");
	  ServletConfig config =  getServletConfig();
	  String d1 = config.getInitParameter("d1"); 
	  String d2 = config.getInitParameter("d2");
	  
	  out.print("<br/>"+d1+" : "+d2);
	  
	  ServletContext context =  config.getServletContext();
	  String D = context.getInitParameter("D");
	  out.print("<br/>"+D);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
        System.out.println("Destroy called......");
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}
}
