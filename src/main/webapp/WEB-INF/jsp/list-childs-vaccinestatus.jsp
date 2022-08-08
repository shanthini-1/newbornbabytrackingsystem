<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="viewform" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Vaccine</title>
</head>
<body>
	<div id="root">
		<div id="form">
		<viewform:form action="" method="get" modelAttribute="getVaccine">
			<div>
				<label for="vaccineId">Vaccine Id</label>
			</div>
			<div>
				<viewform:input path="vaccineId" readonly="true" />
			</div>
			<div>
				<label for="week">Week</label>
			</div>
			<div>
				<viewform:input path="week" readonly="true" />
			</div>
			<div>
				<label for="vaccineName">Vaccine Name </label>
			</div>
			<div>
				<viewform:input path="vaccineName" readonly="true" />
			</div>
			<div>
				<label for="vacDescription">Description</label>
			</div>
			<div>
				<viewform:input path="vacDescription" readonly="true" />
			</div>
			<div>
				<label for="dosage">Dosage</label>
			</div>
			<div>
				<viewform:input path="dosage" readonly="true" />
			</div>
			<div>
				<label for="suggestion">Suggestion</label>
			</div>
			<div>
				<viewform:input path="suggestion" readonly="true" />
			</div>
			<div>
				<label for="vaccinePrice">Vaccine price</label>
			</div>
			<div>
				<viewform:input path="vaccinePrice" readonly="true" />
			</div>
			</viewform:form>
		</div>
	</div>
<div id="root">
		<div id="vacform">
			<table>
				<thead>
					<tr>
						<th>Child Id</th>
						<th>Child Name</th>
						<th>Child Dob</th>
						<th>Gender</th>
						<th>Birth Weight</th>
						<th>Birth Place</th>
						<th>Blood Group</th>
						<th>Hospital Id</th>
						<th>Doctor Id</th>
						<th>Father Id</th>
						<th>Mother Id</th>
						<th>Guardian Id</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="child" items="${vacchilddetailslist}">
						<tr>
							<td>${child.childId}</td>
							<td>${child.childName}</td>
							<td>${child.childDob}</td>
							<td>${child.gender}</td>
							<td>${child.birthWeight}</td>
							<td>${child.birthPlace}</td>
							<td>${child.bloodGroup}</td>
							<td>${child.hospitalId}</td>
							<td>${child.doctorId}</td>
							<td>${child.fatherId}</td>
							<td>${child.motherId}</td>
							<td>${child.guardianId}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>