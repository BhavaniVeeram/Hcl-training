<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin: 0px;
		box-sizing: border-box;
	}
	header{
		background-color: blue;
		color: white;
		text-align: center;
		margin-bottom: 10px;
	}
	.new{
	text-decoration: none;
	color: white;
	background-color: red;
	padding: 4px;
	box-shadow: 8px;
	}
</style>
</head>
<body>
	<%@include file="header.jsp" %>
	<a class="new" href="./new" >New Employee</a>
</body>
</html>