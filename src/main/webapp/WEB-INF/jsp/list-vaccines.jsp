<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of vaccine</title>
</head>
<body>
	<div id="root">
		<div id="vacform">
			<table>
				<thead>
					<tr>
						<th>Vaccine Id</th>
						<th>Vaccine Name</th>
						<th>Week</th>
						<th>Vaccine Description</th>
						<th>Dosage</th>
						<th>Suggestion</th>
						<th>Vaccine Price</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="vac" items="${allvaccines}">
						<tr>
							<td>${vac.vaccine_id}</td>
							<td>${vac.vaccine_name}</td>
							<td>${vac.week}</td>
							<td>${vac.vac_description}</td>
							<td>${vac.dosage}</td>
							<td>${vac.suggestion}</td>
							<td>${vac.vaccine_price}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>