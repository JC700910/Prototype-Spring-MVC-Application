<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<title>Spring 4 MVC Hello World Example with Maven Eclipse</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' />  
</head>
<body>
	<h2>Hello World, Spring MVC</h2>

	<p>Welcome, ${name}</p>
	 <c:set var="a" value="5" scope="request" />
    <c:set var="b" value="15" scope="request" />
    <p>Expression output: ${a+b}</p>
</body>
</html>