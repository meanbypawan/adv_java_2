<!DOCTYPE html>
<html lang="en">
<head>
  <%@include file="__bootstrap.jsp" %>
</head>
<body>
    <div class="container-fluid d-flex justify-content-center align-items-center" style="height:600px">
       <div class="form" style="width:30%; height: auto; box-shadow: 10px 10px 10px grey;">
          <h3 class="bg-danger text-white p-2 text-center">Sign up here</h3>
          <form class="p-2">
            <div class="form-group">
               <input type="text" class="form-control" placeholder="Enter name"/>
            </div>
            <div class="form-group">
               <input type="email" class="form-control" placeholder="Enter email id"/>
            </div>
            <div class="form-group">
               <input type="text" class="form-control" placeholder="Enter contact"/>
            </div>
            <div class="form-group">
               <input type="password" class="form-control" placeholder="Enter password"/>
            </div>
            <div class="form-group">
               <button class="text-white btn btn btn-secondary" style="width:100%;">Submit</button>
            </div>
            <p class="text-center text-primary" style="cursor:pointer;"><a href="signin.jsp">Already have account ?</a></p>
          </form>
       </div>
    </div>
</body>
</html>
