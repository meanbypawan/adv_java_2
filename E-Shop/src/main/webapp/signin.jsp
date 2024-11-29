<!DOCTYPE html>
<html lang="en">
<head>
  <%@include file="__bootstrap.jsp" %>
</head>
<body>
    <div class="container-fluid d-flex justify-content-center align-items-center" style="height:600px">
       <div class="form" style="width:30%; height: auto; box-shadow: 10px 10px 10px grey;">
          <h3 class="bg-danger text-white p-2 text-center">Sign in here</h3>
          <form action="controller/signin_action.jsp" method="POST" class="p-2">
            <div class="form-group">
               <input name="email" type="email" class="form-control" placeholder="Enter email id"/>
            </div>
            <div class="form-group">
               <input name="password" type="password" class="form-control" placeholder="Enter password"/>
            </div>
            <div class="form-group">
               <button type="submit" class="text-white btn btn btn-secondary" style="width:100%;">Submit</button>
            </div>
            <p class="text-center text-primary" style="cursor:pointer;"><a href="signup.jsp">Create new account ?</a></p>
          </form>
       </div>
    </div>
</body>
</html>
