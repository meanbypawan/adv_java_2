<%
  Object isLoggedIn =  session.getAttribute("isLoggedIn");
%>
<nav class="d-flex justify-content-between navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="d-flex justify-content-around text-white" style="width:70%;">
    <%if(isLoggedIn!=null){ %>
    <span class="bg-danger d-flex justify-content-center align-items-center" style="display:block; width:200px; height:40px;border: 1px solid white">Welcome <%=session.getAttribute("name").toString().toUpperCase() %></span>
    <%} %>
    <span>Home</span>
    <span>Categories</span>
    <a href="dashboard.jsp"><span>Products</span></a>
    <%if(isLoggedIn == null){ %>
    <span><a href="signin.jsp" class="text-white">Sign in</a></span>
    <span><a href="signup.jsp" class="text-white" style="text-decoration:none;">Sign up</a></span>
    <%}else{%>
      <span><a href="controller/signout.jsp" class="text-white" style="text-decoration:none;">Sign out</a></span>
    <%} %>
  </div>
  <form class="form-inline" action="/action_page.php">
    <input class="form-control mr-sm-2" type="text" placeholder="Search">
    <button class="btn btn-success" type="submit">Search</button>
  </form>
 </nav>