<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>
	<%-- <!-- if we use httpservletRequest use form --> <!--  -->
	<!-- <form action="process" method="post">
		<!-- Eno<input type="text" name="eno" id="eno"><br> --><!-- bcz eno is auto increment -->
		Name<input type="text" name="ename" id="ename"><br>
		Address<input type="text" name="address" id="address"><br>
		<input type="submit" value="Submit">
	</form> --> --%>
	<!-- uses Spring tag lib -->
	<!-- by using modelAttribute only we can return the emp obj  -->
	
	<f:form action="process" method="post" modelAttribute="emp">
		Name<f:input path="ename"/><f:errors path="ename" cssClass="error"></f:errors><br>
		Address<f:input path="address"/><f:errors path="address" cssClass="error"></f:errors><br>
		<input type="submit" value="Submit"> 
	</f:form>
</body>
</html>