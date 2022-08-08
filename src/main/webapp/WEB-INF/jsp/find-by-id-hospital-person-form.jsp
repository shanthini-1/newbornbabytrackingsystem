<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="findcontactpersonform"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact person with Hospital By Id</title>
</head>
<body>
	<div>
		<findcontactpersonform:form action="" method="get"
			modelAttribute="fetchConPerfromPersonById">
			<div>
				<label for="userName">User Name</label>
			</div>
			<div>
				<findcontactpersonform:input path="userName" readonly="true" />
			</div>
			<div>
				<label for="userDob">User Dob </label>
			</div>
			<div>
				<findcontactpersonform:input path="userDob" readonly="true" />
			</div>
			<div>
				<label for="gender">Gender</label>
			</div>
			<div>
				<findcontactpersonform:input path="gender" readonly="true" />
			</div>
			<div>
				<label for="personCategory">Person Category</label>
			</div>
			<div>
				<findcontactpersonform:input path="personCategory" readonly="true" />
			</div>
			<div>
				<label for="email">Email</label>
			</div>
			<div>
				<findcontactpersonform:input path="email" readonly="true" />
			</div>
			<div>
				<label for="phoneNumber">Phone Number</label>
			</div>
			<div>
				<findcontactpersonform:input path="phoneNumber" readonly="true" />
			</div>
			<div>
				<label for="doorNumber">Door Number</label>
			</div>
			<div>
				<findcontactpersonform:input path="doorNumber" readonly="true" />
			</div>
			<div>
				<label for="street">Street</label>
			</div>
			<div>
				<findcontactpersonform:input path="street" readonly="true" />
			</div>
			<div>
				<label for="city">city</label>
			</div>
			<div>
				<findcontactpersonform:input path="city" readonly="true" />
			</div>
			<div>
				<label for="pinCode">Pin Code</label>
			</div>
			<div>
				<findcontactpersonform:input path="pinCode" readonly="true" />
			</div>
		</findcontactpersonform:form>
	</div>
	<div id="root">
		<div id="form">
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
					<c:forEach var="hospital" items="${listHosByConPrsnId}">
						<tr>
							<td>${hospital.hospitalId}</td>
							<td>${hospital.hospitalName}</td>
							<td>${hospital.hospitalPlotNo}</td>
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