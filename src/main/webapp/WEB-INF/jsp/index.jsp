<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1 style="font-size: large; color: maroon;">Welcome to
		FirstCare!!!</h1>
	<h1>Index page</h1>
	<ul>
		<li>
			<h1>Vaccine</h1>
		<li><a href="/admin/vaccine/vaccineaddform">add vaccine </a>
		<li>
			<form action="/admin/vaccine/vaccinedeleteform" method="get">
				<label>enter id </label> <input type="text" placeholder="vaccine id"
					name="id"> <input type='submit' value="delete"
					name="submit">
			</form>
		<li>
			<form action="/admin/vaccine/vaccineupdateform" method="get">
				<label>enter id </label> <input type="text" placeholder="vaccine id"
					name="id"> <input type='submit' value="update"
					name="submit">
			</form>
		<li>
			<form action="/admin/vaccine/getvaccine" method="get">
				<label>enter id </label> <input type="text" placeholder="vaccine id"
					name="id"> <input type='submit' value="fetch" name="submit">
			</form>
		<li><a href="/admin/vaccine/vaccinelist">list of vaccine </a>
	</ul>
	<a></a>
</body>
</html>