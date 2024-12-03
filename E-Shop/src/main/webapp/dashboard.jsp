<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="__bootstrap.jsp"%>

</head>
<body>
	<%@include file="__header.jsp"%>
	<div class="container mt-4">
		<div class="row">
			<% 
         ArrayList<Product> al =  ProductDAO.getProductList();
         for(Product p : al){
        	 
        	 String title =  p.getTitle();
        	 if(title.length() >= 25)
        		 title = title.substring(0,25);
         %>
			<div class="col-3 mt-2">
				<div class='d-flex flex-column'
					style="box-shadow: 10px 10px 10px grey; height: auto;">
					<img src="<%=p.getThumbnail()%>" style="width: 100%; height: 200px" />
					<p class="text-center mt-2"><%=title%></p>
					<h5 class="text-center">
						<label class="text-success"><%=p.getPrice() %></label> Rs.
					</h5>
					<a class="btn btn-warning" href="view-more.jsp?id=<%=p.getId() %>">
						View more </a>
				</div>
			</div>
			<%}%>
		</div>
	</div>
</body>
</html>