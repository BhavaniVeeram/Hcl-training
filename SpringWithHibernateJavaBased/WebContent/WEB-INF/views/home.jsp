<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Home</h1>
	<a href="add">Add Employee</a>
	<a href="display">Display</a>
	<table>
		<tr>
		<th>Eno</th>
		<th>Ename</th>
		<th>Address</th>
		</tr>
		<c:forEach items="${employees}" var="e">
			<tr>
			<td>${e.eno}</td>
			<td>${e.ename}</td>
			<td>${e.address}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>