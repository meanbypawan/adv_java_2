<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="add.jsp">
      <p>
        <input type="text" name="first"/>
      </p>
      <p>
        <input type="text" name="second"/>
      </p>
      <p>
        <button type="submit">ADD</button>
      </p>
   </form>
   <%
      String s1 = request.getParameter("first");
      String s2 = request.getParameter("second");
      int addition = 0;
      if(s1 !=null && s2!=null){
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        addition = a + b;
      }
   %>
   <h1>Addition : <%=addition %></h1>
</body>
</html>