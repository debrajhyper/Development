<%@page import="java.time.LocalDateTime"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About page</title>
</head>

<body bgcolor="cyan">
	<h5>This is about page</h5>

	<!-- Without using JSP Expression Language -->
	<%-- <%
		String name = (String)request.getAttribute("name");
		Integer roll = (Integer)request.getAttribute("roll");
		LocalDateTime time = (LocalDateTime)request.getAttribute("time");
	%>
	<h2>My name is <%=name%></h2>
	<h2>Roll is <%=roll%></h2>
	<h2>Date and Time : <%=time%></h2> --%>
	
	
	
	<!-- With using JSP Expression Language -->
	<h2>My name is ${ name }</h2>
	
	<h2>Roll is ${ roll }</h2>
	
	<!-- Without using JSTL -->
	<h2>${ marks }</h2>
	  
	<!-- With using JSTL -->
		<c:forEach var="item" items="${ marks }">
			<h2>without tag : ${ item }</h2>
		</c:forEach>
		
		<c:forEach var="item" items="${ marks }">
			<h2>with tag : <c:out value="${ item }" /></h2>
		</c:forEach>
	
	<h2>Date and Time : ${ time }</h2>

</body>
</html>