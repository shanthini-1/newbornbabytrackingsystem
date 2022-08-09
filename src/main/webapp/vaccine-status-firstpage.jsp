<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vaccine Status</title>
</head>
<body>
<ul>
		<li>
			<h1>Vaccination status</h1>
		<li><a href="/admin/vaccinationstatus/vaccinationstatusaddform">add vaccination status </a>
		<li>
			<form action="/admin/vaccinationstatus/vaccinationstatusdeleteform" method="get">
				<label>enter id </label> <input type="text" placeholder="vaccine id"
					name="id"> <input type='submit' value="delete"
					name="submit">
			</form>
		<li>
			<form action="/admin/vaccinationstatus/vaccinationstatusupdateform" method="get">
				<label>enter id </label> <input type="text" placeholder="vaccine id"
					name="id"> <input type='submit' value="update"
					name="submit">
			</form>
		<li>
			<form action="/admin/vaccinationstatus/fetchvaccination" method="get">
				<label>enter id </label> <input type="text" placeholder="vaccine id"
					name="id"> <input type='submit' value="fetch" name="submit">
			</form>
		<li><a href="/admin/vaccinationstatus/listallvaccinationstatus">list of vaccination status </a>
	</ul>
</body>
</html>