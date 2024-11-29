<% 
   session.setAttribute("isLoggedIn", null);
   session.invalidate();
   response.sendRedirect("../dashboard.jsp");
%>