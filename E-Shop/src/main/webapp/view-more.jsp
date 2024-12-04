<%@page import="model.Review"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <%@ include file="__bootstrap.jsp" %>
</head>
<body>
  <%@ include file="__header.jsp" %>
  <%
    String id  = request.getParameter("id");
    Product p =  ProductDAO.getProduct(Integer.parseInt(id));
    ArrayList<String>imageList =  p.getImages();
    ArrayList<Review> reviewList =  p.getReviews();
  %>
  <div class="container mt-5">
    <div class="row">
      <div class="col-md-6 d-flex flex-column" style="height:450px; box-shadow:10px 10px 10px grey;">
          <img src="<%=p.getThumbnail() %>" style="height:350px;"/>
          <div class="d-flex flex-row justify-content-center align-items-center" style="height:100px;">
           <% for(String imageUrl : imageList){%>
             <img src="<%=imageUrl %>" style="width:30%; height:90px;"/>
           <%}%>
          </div>
      </div>
      <div class="col-md-6 p-3 d-flex flex-column" style="height:450px; box-shadow:10px 10px 10px grey;">
         <h5><%=p.getTitle() %> [<%=p.getBrand() %>]</h5>
         <p><%=p.getDescription() %></p>
         <label><b>Warranty Information : </b> <%=p.getWarrantyInformation() %></label>
         <label><b>Shipping Information : </b> <%=p.getShippingInformation()%></label> 
         <label><b>Availability Status : </b> <%=p.getAvailabilityStatus()%></label> 
         <label><b>Rating : </b> <%=p.getRating() %>(5)</label>
         <label>Discounted Price : <b><del class="text-danger"><%=p.getPrice() %></del>
         <span class="text-success"><%=(p.getPrice() - (p.getPrice()*p.getDiscountPercentage())/100) %></span> Rs.</b></label>
         <a href="controller/buy-now.jsp" class="btn btn-warning">Buy now</a>
      </div>
    </div>
    <div class="row mt-5 p-3">
    <%for(Review r : reviewList) {%>
     <div class="col-12 p-2">
       <div class="review-header d-flex justify-content-between bg-danger">
         <small class="text-white"><%=r.getReviewerName() %> [<%=r.getReviewerEmail() %>]</small>
         <small class="text-white"><%=r.getDate() %></small>
       </div>
       <p><%=r.getComment() %></p>
     </div>
     <%}%>
    </div>
  </div>
</body>
</html>