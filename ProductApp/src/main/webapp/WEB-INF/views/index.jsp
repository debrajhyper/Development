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
			<div class="col col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App</h1>
				<div class="card">
					<div class="card-body">
						<table class="table table-hover">
							<thead class="table-dark">
								<tr>
							      	<th scope="col">S No.</th>
							      	<th scope="col">Product Name</th>
							      	<th scope="col">Product Description</th>
							      	<th scope="col">Product Price</th>
							      	<th scope="col" class="text-center">Action</th>
							    </tr>
							</thead>
							<tbody>
								<c:forEach items="${ products }" var="p">
									<tr>
										<th scope="row">INSOL${ p.id }</th>
										<td>${ p.name }</td>
										<td>${ p.desc }</td>
										<td class="fw-bold">&#8377; ${ p.price }</td>
										<td class="d-flex justify-content-evenly">
											<a href="update/${ p.id }" data-bs-toggle="tooltip" data-bs-placement="top" title="Update"><i class="update-icon fas fa-edit text-primary"></i></a>
											<a href="delete/${ p.id }" data-bs-toggle="tooltip" data-bs-placement="top" title="Delete"><i class="delete-icon fas fa-trash text-danger"></i></a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="container text-center mt-5 pt-3">
					<a href="add-product" class="btn btn-success">Add Product</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
