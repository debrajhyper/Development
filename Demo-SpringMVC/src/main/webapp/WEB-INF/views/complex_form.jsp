<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<title>Complex Form</title>
</head>

<body class="form p-5">
	<img class="img-thumbnail mx-auto d-block" alt="my_image" src="<c:url value="/resources/images/AVATARZ2.png" />">

	<div class="container m-4">

		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center">Complex Form</h4>
						<div class="alert alert-danger" role="alert">
							<form:errors path="student.*" />
						</div>

						<form action="handleform" method="post" enctype="multipart/form-data">
							<div class="form-group mb-3">
								<label for="Name" class="form-label">Name</label>
								<input name="name" type="text" class="form-control" id="Name" placeholder="Enter Your Name...">
							</div>
							<div class="form-group mb-3">
								<label for="Id" class="form-label">Id</label>
								<input name="id" type="text" class="form-control" id="Id" placeholder="Enter Your ID...">
							</div>
							<div class="form-group mb-3">
								<label for="DOB" class="form-label">Date of Birth</label>
								<input name="dob" type="text" class="form-control" id="DOB" placeholder="dd/mm/yyyy">
							</div>
							<div class="form-group mb-3">
								<label for="Course" class="form-label">Courses</label>
								<select name="courses" class="form-select" id="Course" multiple aria-label="multiple select example" style="min-height:10em;">
									<option value="Java">Java</option>
								  	<option value="JavaScript">JavaScript</option>
								  	<option value="Python">Python</option>
								  	<option value="C">C</option>
								  	<option value="C++">C++</option>
								  	<option value="GoLang">GoLang</option>
								  	<option value="Ruby">Ruby</option>
								</select>
							</div>
							<div class="form-group mb-3">
								<label for="Gender" class="form-label me-4">Gender :</label>
								<div class="form-check form-check-inline">
								  	<input class="form-check-input" type="radio" name="gender" id="inlineRadio1" value="Male">
								  	<label class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
								  	<input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="Female">
								  	<label class="form-check-label" for="inlineRadio2">Female</label>
								</div>
								<div class="form-check form-check-inline">
								  	<input class="form-check-input" type="radio" name="gender" id="inlineRadio2" value="Other">
								  	<label class="form-check-label" for="inlineRadio2">Other</label>
								</div>
							</div>
							<div class="form-group mb-3">
								<label for="Type" class="form-label">Type</label>
								<select name="type" class="form-select" id="Type" aria-label="Default select example">
								  	<option value="oldStudent">Old Student</option>
								  	<option value="newStudent">New Student</option>
								  	<option value="currentStudent">Current Student</option>
								</select>
							</div>
							<div class="card form-group mb-3">
								<div class="card-body">
									<p>Address</p>
									<div class="row">
										<div class="form-group mb-3 ms-2 me-2 col">
											<input name="address.street" type="text" class="form-control" id="Street" placeholder="Enter Street">
										</div>
										<div class="form-group mb-3 ms-2 me-2 col">
											<input name="address.city" type="text" class="form-control" id="City" placeholder="Enter City">
										</div>
									</div>
								</div>
							</div>
							<div class="form-group mb-3">
								<label for="UploadImage" class="form-label">Upload Image</label>
								<br>
								<input name="profile" type="file" class="form=control-file" id="UploadImage">
							</div>
							<div class="container text-center">
								<button type="submit" class="btn btn-primary mt-3">Submit</button>
							</div>
						</form>

					</div>
				</div>
			</div>
		</div>

	</div>

	
	<script src="<c:url value="/resources/js/script.js" />"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>