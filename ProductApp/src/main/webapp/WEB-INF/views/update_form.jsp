<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col col-md-6 offset-md-3 p-5">
				<h1 class="text-center mb-5 pb-2">Update Product Details</h1>
				
				<form action="${ pageContext.request.contextPath }/handleProduct" method="post" class="needs-validation" novalidate>
					<input name="id" type="hidden" value="${ updateProductInfo.id }">
					<div class="form-group mb-3">
						<label for="Name" class="form-label">Product Name</label>
						<input value="${ updateProductInfo.name }" name="name" type="text" class="form-control" id="Name" placeholder="Enter the Product Name here">
						<div class="valid-feedback">Looks good!</div>
						<div class="invalid-feedback">Please choose a Product Name</div>
					</div>
					<div class="form-group mb-3">
						<label for="Description" class="form-label">Product Description</label>
						<textarea name="desc" class="form-control" id="Description" rows="4" placeholder="Enter the Product Description">${ updateProductInfo.desc }</textarea>
					</div>
					<div class="form-group mb-5">
						<label for="Price" class="form-label">Product Price</label>
						<input value="${ updateProductInfo.price }" name="price" type="text" class="form-control" id="Price" placeholder="Enter Product Price">
					</div>
					<div class="container text-center d-flex justify-content-evenly">
						<button type="submit" class="btn btn-success ps-4 pe-4">Update</button>
						<a href="${ pageContext.request.contextPath }/" class="btn btn-outline-warning ps-4 pe-4">Back</a>
					</div>
				</form>
		
			</div>
		</div>
	</div>
	

</body>
</html>