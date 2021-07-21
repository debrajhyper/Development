<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Contact</title>
  </head>
  
  <body class="p-5">
    
    <div class="container m-10">
    	<h2 class="text-center">${ Header }</h2>
    	<h6 class="text-center">${ Desc }</h6>
    	
    	<form action="processform" method="post">
    		<h3 class="mb-3">Registration Form</h3>
			<div class="mb-3">
			    <label for="Email" class="form-label">Email address</label>
			    <input name="email" type="email" class="form-control" id="Email" aria-describedby="emailHelp">
		  	</div>
		  	<div class="mb-3">
			    <label for="Name" class="form-label">User Name</label>
			    <input name="userName" type="text" class="form-control" id="Name">
		  	</div>
		  	<div class="mb-3">
			    <label for="Password" class="form-label">Password</label>
			    <input name="password" type="password" class="form-control" id="Password">
		  	</div>
		  	<button type="submit" class="btn btn-primary mt-3">Submit</button>
		</form>
		
    </div>
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>