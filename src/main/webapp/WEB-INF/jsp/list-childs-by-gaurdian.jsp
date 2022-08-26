<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="findpersonform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang ="en">
<head>
<meta charset="ISO-8859-1">
<title>List of Child Guardian id</title>
</head>
<body>

	
			<table>
			<caption>Children</caption>
				<thead>
					<tr>
						<th>Child Register NO</th>
						<th>Child Name</th>
						<th>Child Dob</th>
						<th>Gender</th>
						<th>Birth Weight</th>
						<th>Birth Place</th>
						<th>Blood Group</th>
						<th>Hospital Id</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach var="child" items="${listofchildbyguardian}">
						<tr>
							<td>${child.childId}</td>
							<td>${child.childName}</td>
							<td>${child.childDob}</td>
							<td>${child.gender}</td>
							<td>${child.birthWeight}</td>
							<td>${child.birthPlace}</td>
							<td>${child.bloodGroup}</td>
							<td>${child.hospital.hospitalName}</td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>