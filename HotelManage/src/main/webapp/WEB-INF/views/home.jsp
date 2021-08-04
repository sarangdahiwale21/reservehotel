<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Hotel</title>
<%@include file="all_js_css.jsp"%>
<!-- <script type="text/javascript" src="webjars/jquery/3.6.0/dist/jquery.min.js"></script>  -->
<script>
	$(document).ready(function(){ 
		$("#city").change(function(){ 
			var val=$(this).val(); 
			if(val=="Bangalore"){ 
				$("#hotel").html("<option value='The Lalit Ashok'>The Lalit Ashok Hotel</option> <option value='Lemon Tree'>Lemon Tree Hotel</option><option value='The Oberoi'>The Oberoi Hotel</option>"); 
				}
			else if(val=="Chennai"){ 
				$("#hotel").html("<option value='The RainTree'>The RainTree Hotel</option> <option value='Savera'>Savera Hotel</option><option value='Buhari'>Buhari Hotel</option>"); 
				}
			else if(val=="Delhi"){ 
				$("#hotel").html("<option value='Taj Palace'>Taj Palace Hotel</option> <option value='City Star'>Hotel City Star</option><option value='JuSTa Atrio'>JuSTa Atrio Hotel</option>"); 
				}
			else if(val=="Hyderabad"){ 
				$("#hotel").html("<option value='Tabla'>Tabla Hotel</option> <option value='The Park'>The Park Hotel</option><option value='Vivanta'>Vivanta Hotel</option>"); 
				}
			 });
		  $("#date1").change(function(){ 
			  var date=new Date($(this).val()); 
			  var ldate=new Date(2021,0,1); 
			  var rdate=new Date(2021,11,30); 
			  if(date<ldate || date>rdate) 
				  { 
				  this.value=""; 
				  $("#error").html("Enter Date between Jan and Dec of 2020"); 
				  }
			   else { 
				   $("#error").html(""); 
				   } 
			   }); 
		   }); 
	</script>
	</head>
<body style="background-color:#1c87c9;">
<div class="container">
<h1> <span class="badge badge-secondary" style="margin-left: 30%;margin-top: 20px;padding-left: 20px;padding-right: 20px;padding-top: 10px;
	padding-bottom: 10px">Hotel Reservation System</span></h1>
</div>

<div class="container p-3 my-3 bg-dark text-white" style="background:green">
		<br>

		<h1>Book your Table Here</h1>
		<br>

		<!-- this is add form  -->

		<form action="checkhotel" method="post">

			<div class="form-group">
				<label for="city">City : </label> 
				<select 
				name="city"
				required 
				class="form-control" 
				aria-describedby="select City"
				id="city"
				>
				<option >Select city..</option>
				<option value="Bangalore">Bangalore</option>
				<option value="Chennai">Chennai</option>
				<option value="Delhi">Delhi</option>
				<option value="Hyderabad">Hyderabad</option>
				</select>

			</div>


			<div class="form-group">
				<label for="hotel">Hotel : </label>
				<select
				name="hotel"
				required 			 
				class="form-control"
				id="hotel" 
					>
					<option >Select Hotel..</option>
					</select>


			</div>
			<div class="form-group">
				<label for="date">Date : </label>
				<input
				name="date"
				type="date"
				required 			 
				class="form-control"
				placeholder="Check ...."
				id="date1" 
					/>
					
		

			</div>
			<div class="form-group">
				<label for="error" id="error"></label>
			</div>
			
			<div class="container text-center">

				<button type="submit" class="btn btn-primary">Check</button>
			</div>

		</form>

	</div>
</body>
</html>