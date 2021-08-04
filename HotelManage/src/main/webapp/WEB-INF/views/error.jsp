<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="all_js_css.jsp"%>
<body style="background-color:#1c87c9;">
<div style="width:100%;height: 40px">

</div>
 <div class="container p-3 my-3 bg-dark text-white ">
    <p>Sorry this hotel is not available for the chosen data. Please click on below link to choose another hotel. </p>
    <a href="<c:url value='home'/>">Choose Again</a>
  </div>

</body>
</html>