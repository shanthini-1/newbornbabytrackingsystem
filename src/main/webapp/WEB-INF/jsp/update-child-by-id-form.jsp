<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update child</title>
</head>
<body>
	<form:form action="/admin/child/childmodifyform" method="get">
		<label>enter id </label>
		<input type="text" placeholder="child id" name="id">
		<input type='submit' value="update" name="submit">
	</form:form>
</body>
</html>