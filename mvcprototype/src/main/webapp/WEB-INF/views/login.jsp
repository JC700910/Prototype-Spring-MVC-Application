<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Login</title>
    
     <!-- Custom styles for this template -->
    <link href='<c:url value="/resources/bootstrap-3.3.7/css/bootstrap.min.css"/>' rel="stylesheet" type='text/css' media='all' >

    <link rel='stylesheet' href='<c:url value="/resources/css/signin.css" />' type='text/css' media='all' />  
    <!-- Bootstrap -->

  
  </head>
 <body>

    <div class="container">

      
 <form:form id="loginForm" method="post" action="login" modelAttribute="loginBean" cssClass="form-signin">   
           
            <h2 class="form-signin-heading">Please sign in</h2>

 
            <form:label path="username" cssClass="sr-only" for="username" >Enter your user-name</form:label> 


            <form:input id="username" name="username" path="username" cssClass="form-control" placeholder="Email address" required="required" autofocus="autofocus"/>


           <form:label path="username" cssClass="sr-only" for="password" placeholder="Password"  >Please enter your password</form:label> 

            <form:password id="password" name="password" path="password" cssClass="form-control" placeholder="Password" required="required"/><br>   
 
            <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in" /> 
 
        </form:form> 


    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src='<c:url value="/resources/js/jquery-3.1.1.min.js"/>'></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src='<c:url value="/resources/bootstrap-3.3.7/js/bootstrap.min.js"/>'></script>
  </body>
</html>