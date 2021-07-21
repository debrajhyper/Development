<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<title>Form Success</title>
</head>

<body class="form_success">
	<img class="img-thumbnail mx-auto d-block" alt="my_image" src="<c:url value="/resources/images/AVATARZ-Tomas.png" />">
	
	<h3>Name : ${ student.name }</h3>
	<h3>Id : ${ student.id }</h3>
	<h3>DOB : ${ student.dob }</h3>
	<h3>
		Courses :
		<ol>
			<c:forEach var="course" items="${ student.courses }">
				<li><c:out value="${ course }" /></li>
			</c:forEach>
		</ol>
	</h3>
	<h3>Gender : ${ student.gender }</h3>
	<h3>Type : ${ student.type }</h3>
	<hr>
	<h3>Address</h3>
	<h3>Street : ${ student.address.street }</h3>
	<h3>City : ${ student.address.city }</h3>
	<hr>
	<h4>${ msg }</h4>
	<img alt="profile image" src="<c:url value="/resources/fileUpload/${ filename }" />">

</body>
</html>