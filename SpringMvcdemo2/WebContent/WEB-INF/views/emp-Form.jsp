<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.form{
	box-shadow: 8px;
	margin: 20px;
	}
	.form-group{
		margin: 10px;
	}
</style>
</head>
<body>
	<section class="form">
		<form action="process" method="post">
		<div class="form-group">
			<label for="eno">Eno</label>
			<input type="text" name="eno" class="eno" id="eno">
		</div>
		<div class="form-group">
			<label for="name">Name</label>
			<input type="text" name="name" class="name" id="name">
		</div>
		<div class="form-group">
			<label for="address">Address</label>
			<input type="text" name="address" class="address" id="address">
		</div>
		<div class="btn-action">
			<button type="submit">Submit</button>
		</div>
		</form>
	</section>
</body>
</html>