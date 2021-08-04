<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<%@include file="all_js_css.jsp"%>
<body style="background-color:#1c87c9;">
	<div style="width: 100%;height: 40px;">
	
	</div>
  <div class="container p-3 my-3 bg-dark text-white ">
  	<h1>${hotelname} Hotel,${cityname}</h1>
  	<br>
    <p>Dear ${guestname}, Thank you for choosing ${hotelname} Hotel ${cityname}<br>It is our pleasure to confirm your reservation. </p>
  </div>
</body>
</html>