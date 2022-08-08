<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="findchildprentform"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Hospital Child By Id</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<div>
				<findchildprentform:form action="" method="get"
					modelAttribute="childdetails">
					<div>
						<label for="childId">Child Id</label>
					</div>
					<div>
						<findchildprentform:input path="childId" />
					</div>
					<%-- <div>
					<label for="childName">Child Name</label>
				</div>
				<div>
					<findchildprentform:input path="childName" />
				</div>
				<div>
					<label for="childDob">Child Dob </label>
				</div>
				<div>
					<findchildprentform:input path="childDob" />
				</div>
				<div>
					<label for="gender">Gender</label>
				</div>
				<div>
					<findchildprentform:input path="gender" />
				</div>
				<div>
					<label for="birthWeight">Birth Weight</label>
				</div>
				<div>
					<findchildprentform:input path="birthWeight" />
				</div>
				<div>
					<label for="birthPlace">Birth Place</label>
				</div>
				<div>
					<findchildprentform:input path="birthPlace" />
				</div>
				<div>
					<label for="bloodGroup">Blood Group</label>
				</div>
				<div>
					<findchildprentform:input path="bloodGroup" />
				</div>
				<div>
					<label for="hospitalId">Hospital Id</label>
				</div>
				<div>
					<findchildprentform:input path="hospitalId" />
				</div>
				<div>
					<label for="doctorId">Doctor Id</label>
				</div>
				<div>
					<findchildprentform:input path="doctorId" />
				</div>
				<div>
					<label for="fatherId">Father Id</label>
				</div>
				<div>
					<findchildprentform:input path="fatherId" />
				</div>
				<div>
					<label for="motherId">Mother Id</label>
				</div>
				<div>
					<findchildprentform:input path="motherId" />
				</div>
				 <div>
					<label for="guardianId">Mother Id</label>
				</div>
				<div>
					<findchildprentform:input path="guardianId" />
				</div> --%>
				</findchildprentform:form>
			</div>

			<div>
				<table>
					<thead>
						<tr>
							<th>User Id</th>
							<th>User Name</th>
							<th>User Dob</th>
							<th>Gender</th>
							<th>Person Category</th>
							<th>Email</th>
							<th>Phone Number</th>
							<th>Door Number</th>
							<th>Street</th>
							<th>City</th>
							<th>Pin Code</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="person" items="${childFatherdetails}">
							<tr>
								<td>${person.userId}</td>
								<td>${person.userName}</td>
								<td>${person.userDob}</td>
								<td>${person.gender}</td>
								<td>${person.personCategory}</td>
								<td>${person.email}</td>
								<td>${person.phoneNumber}</td>
								<td>${person.doorNumber}</td>
								<td>${person.street}</td>
								<td>${person.city}</td>
								<td>${person.pinCode}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div>
				<table>
					<thead>
						<tr>
							<th>User Id</th>
							<th>User Name</th>
							<th>User Dob</th>
							<th>Gender</th>
							<th>Person Category</th>
							<th>Email</th>
							<th>Phone Number</th>
							<th>Door Number</th>
							<th>Street</th>
							<th>City</th>
							<th>Pin Code</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="person" items="${childMotherdetails}">
							<tr>
								<td>${person.userId}</td>
								<td>${person.userName}</td>
								<td>${person.userDob}</td>
								<td>${person.gender}</td>
								<td>${person.personCategory}</td>
								<td>${person.email}</td>
								<td>${person.phoneNumber}</td>
								<td>${person.doorNumber}</td>
								<td>${person.street}</td>
								<td>${person.city}</td>
								<td>${person.pinCode}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>