<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	padding-bottom: 10px"> Reservation Form</span></h1>
</div>

<div class="container p-3 my-3 bg-dark text-white">
		<br>

		<!-- this is add form  -->

		<form action="welcome" method="post">

			<div class="form-group">
				<label for="guestname">Guest Name : </label> 
				<input
				name="guestname"
				type="text"
				required 			 
				class="form-control"
				placeholder="Enter Name..."
				id="guestname" 
					/>
			</div>


			<div class="form-group">
				<label for="gender">Gender : </label>
				<select
				name="hotel"
				required 			 
				class="form-control"
				id="gender" 
					>
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
					</select>


			</div>
			<div class="form-group">
				<label for="age">Age : </label> 
				<input
				name="age"
				type="number"
				required 			 
				class="form-control"
				placeholder="Enter Age...."
				id="age" 
					/>
			</div>
			
			<div class="form-group">
				<label for="email">Email Id : </label> 
				<input
				name="email"
				type="email"
				required 			 
				class="form-control"
				placeholder="abc@gmail.com"
				id="email" 
					/>
			</div>
			
			<div class="form-group">
				<label for="mobile">Mobile No. : </label> 
				<input
				name="mobileno"
				type="number"
				maxlength="10"
				required 			 
				class="form-control"
				placeholder="123456789"
				id="mobileno" 
					/>
			</div>
			<div class="form-group">
				<label for="error" id="error"></label>
			</div>
			
			<div class="container text-center">

				<button type="submit" class="btn btn-primary">Reserve</button>
			</div>

		</form>

	</div>
</body>
</html>