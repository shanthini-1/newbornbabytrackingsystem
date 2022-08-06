<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Hospital</title>
</head>
<body>
	<div id="root">
		<div id="hosform">
			<table>
				<thead>
					<tr>
						<th>Hospital Id</th>
						<th>Hospital Name</th>
						<th>Hospital Plot No</th>
						<th>Hospital Street</th>
						<th>Hospital City</th>
						<th>Hospital pin Code</th>
						<th>Contact Person Id</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="hospital" items="${listAllHospitals}">
						<tr>
							<td>${hospital.hospitalId}</td>
							<td>${hospital.hospitalName}</td>
							<td>${hospital.hospitalPlotId}</td>
							<td>${hospital.hospitalStreet}</td>
							<td>${hospital.hospitalCity}</td>
							<td>${hospital.pinCode}</td>
							<td>${hospital.contactPersonId}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>