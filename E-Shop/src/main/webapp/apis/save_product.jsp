<%@page import="java.util.HashMap"%>
<%@page import="dao.ProductDAO"%>
<%@page import="java.lang.reflect.Type"%>
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.reflect.TypeToken"%>
<%@page import="com.google.gson.JsonArray"%>
<%@page import="com.google.gson.Gson"%>
<% 
  if(request.getMethod().equals("POST")){
	try{
		Gson gson = new Gson();
		JsonArray arr =  gson.fromJson(request.getReader(), JsonArray.class);
	    Type listType = new TypeToken<ArrayList<Product>>(){}.getType();
	    ArrayList<Product>al =  gson.fromJson(arr, listType);
	    HashMap<String,String> hm = new HashMap<String,String>();
	   if(ProductDAO.save(al)){
	      hm.put("message","All product saved..");
	    }
	    else
	    	hm.put("error","Oops! something went wrong..");
	   String jsonString =  gson.toJson(hm);
	   out.print(jsonString);
	    
	}
	catch(Exception e){
		e.printStackTrace();
	}
  }
  else
	  out.print("Can not handle get request");
%>