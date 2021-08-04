<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<%@include file="all_js_css.jsp"%>
<body style="background-color:#1c87c9;">
<div class="container">
<h1> <span class="badge badge-secondary" style="margin-left: 30%;margin-top: 20px;padding-left: 20px;padding-right: 20px;padding-top: 10px;
	padding-bottom: 10px">Hotel Details</span></h1>
</div>
<div class="container p-3 my-3 bg-dark text-white">
		<br>

		<h1>Book your Table Here</h1>
		<br>

		<!-- this is add form  -->

		<form action="confirm" method="post">

			<div class="form-group">
				<label for="roomtype">Room Type : </label> 
				<input
				name="roomtype"
				type="text"
				required 			 
				class="form-control"
				placeholder="Check ...."
				id="date1" 
				value="${roomtype}"
				readonly
					/>

			</div>


			<div class="form-group">
				<label for="price">Price : </label>
				<input
				name="price"
				type="number"
				required 			 
				class="form-control"
				placeholder="Check ...."
				id="date1" 
				value="${price}"
				readonly
					/>


			</div>
			
			<div class="form-group">
				<label for="gst">GST : </label>
				<input
				name="gst"
				type="number"
				required 			 
				class="form-control"
				placeholder="Check ...."
				id="date1" 
				value="${gst}"
				readonly
					/>


			</div>
			<div class="form-group">
				<label for="total">Total : </label>
				<input
				name="total"
				type="number"
				required 			 
				class="form-control"
				placeholder="Check ...."
				id="date1" 
				value="${total}"
				readonly
					/>
					
		

			</div>
			<div class="form-group">
				<label for="error" id="error"></label>
			</div>
			
			<div class="container text-center">

				<button type="submit" class="btn btn-primary">Confirm</button>
				<a href="<c:url value='home'/>"><button type="button" class="btn btn-primary" >Back</button></a>
			</div>
			

		</form>

	</div>
</body>
</html>