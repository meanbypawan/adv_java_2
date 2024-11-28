<%
   String n1 =  request.getParameter("first");
   String n2 = request.getParameter("second");
   
   int a = Integer.parseInt(n1);
   int b = Integer.parseInt(n2);
   
   out.print("Addition : "+(a+b));
%>