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
  %>
  <div class="container mt-5">
    <div class="row">
      <div class="col-md-6">
      </div>
      <div class="col-md-6">
      </div>
    </div>
  </div>
</body>
</html>