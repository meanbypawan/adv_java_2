<%@page import="dao.CategoryDAO"%>
<%@page import="java.lang.reflect.Type"%>
<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.reflect.TypeToken"%>
<%@page import="com.google.gson.JsonArray"%>
<%@page import="com.google.gson.Gson"%>
<%
  if(request.getMethod().equals("POST")){
	  Gson gson = new Gson();
	  JsonArray arr =  gson.fromJson(request.getReader(), JsonArray.class);
      Type listType =  new TypeToken<ArrayList<Category>>(){}.getType();
      ArrayList<Category>list =  gson.fromJson(arr, listType);
      if(CategoryDAO.saveInBulk(list))
    	  out.print("All Category saved...");
      else
    	  out.print("Somehting wrong....");
  }
  else
	  out.println("Can not handle get request...");
%>
