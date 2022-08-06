<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>child vaccination scheduler</title>
</head>
<body>
	<div id="root">
		<div id="vacform">
			<table>
				<thead>
					<tr>
						<th>Child Id</th>
					</tr>
					<tr>
						<th>Vaccine Id</th>
						<th>Date To Vaccinate</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="vac" items="${scheduler}">
						<tr>
							<td>${vac.vaccineId}</td>
							<td>${vac.dateToVaccinate}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
