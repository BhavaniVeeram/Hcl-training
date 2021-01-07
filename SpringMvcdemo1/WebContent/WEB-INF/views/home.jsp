<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Home</h1>
	<a href="./display">Display Details</a>
	<table border="1">
	<c:forEach items="${requestScope.emps}" var="e">
		<tr>
		<td><c:out value="${e.eno}"/></td>
		<td><c:out value="${e.name}"/></td>
		<td><c:out value="${e.address}"/></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>