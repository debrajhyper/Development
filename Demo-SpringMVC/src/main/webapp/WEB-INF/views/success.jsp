<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Submitted</title>
</head>

<body bgcolor="green" style="color:white;">
	<h5>${ Header }</h5>
	<h5>${ Desc }</h5>
	<hr>
	<h1>${ msg }</h1>
	<hr>
	<h1>welcome, ${ user.userName }</h1>
	<h1>Your Email id is: ${ user.email }</h1>
	<h1>Your Password is : ${ user.password }</h1>
</body>
</html>