<%@page import="dao.UserDAO"%>
<jsp:useBean id="user" class="model.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
   if(request.getMethod().equals("POST")){
      if(UserDAO.save(user)){%>
    	    <script>
    	      window.alert("Signup success...");
    	      window.location.href="../signin.jsp"; 
    	    </script>
      <%}
   }
   else
	   out.print("Invalid Request....");
%>