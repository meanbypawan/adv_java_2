<%@page import="dao.UserDAO"%>
<%@page import="model.User"%>
<jsp:useBean id="user" class="model.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
 User u = UserDAO.authenticate(user);
 if(u!=null){
	 session.setAttribute("currentUserId", u.getId());
	 session.setAttribute("name",u.getName());
	 session.setAttribute("email",u.getEmail());
	 session.setAttribute("contact",u.getContact());
	 session.setAttribute("isLoggedIn",true);
	 response.sendRedirect("../dashboard.jsp");
 }
 else{%>
   <script>
	 window.alert("Invalid User");
	 window.location.href="../signin.jsp";
   </script>
 <%}
%>