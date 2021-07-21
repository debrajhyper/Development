<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>

<body>
	<h5>This is index page</h5>

	<%
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");
		List<String> friends = (List<String>) request.getAttribute("frnds");
	%>

	<h1>
		Name is
		<%=name%></h1>

	<h2>
		Id is
		<%=id%></h2>

	<h3>
		Friends
		<ol>
			<%
			for (String s : friends) {
			%>
				<li><%=s%></li>
			<%
			}
			%>
		</ol>
	</h3>

</body>
</html>