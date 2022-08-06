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
	<div id="root">
		<div id="form">
			<findcontactpersonform:form action="" method="get"
				modelAttribute="fetchContactPersonById">
				<div>
					<label for="hospitalId">Hospital Id</label>
				</div>
				<div>
					<findcontactpersonform:input path="hospitalId" />
				</div>
				<div>
					<label for="hospitalName">Hospital Name</label>
				</div>
				<div>
					<findcontactpersonform:input path="hospitalName" />
				</div>
				<div>
					<label for="hospitalPlotNo">Hospital Plot No</label>
				</div>
				<div>
					<findcontactpersonform:input path="hospitalPlotNo" />
				</div>
				<div>
					<label for="hospitalStreet">Hospital Street</label>
				</div>
				<div>
					<findcontactpersonform:input path="hospitalStreet" />
				</div>
				<div>
					<label for="hospitalCity">Hospital City</label>
				</div>
				<div>
					<findcontactpersonform:input path="hospitalCity" />
				</div>
				<div>
					<label for="pinCode">Hospital pin Code</label>
				</div>
				<div>
					<findcontactpersonform:input path="pinCode" />
				</div>
				<div>
					<label for="contactPersonId">Contact Person Id</label>
				</div>
				<div>
					<findcontactpersonform:input path="contactPersonId" />
				</div> 
				</findcontactpersonform:form>
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
				</div><div>
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
	</div>
</body>
</html>