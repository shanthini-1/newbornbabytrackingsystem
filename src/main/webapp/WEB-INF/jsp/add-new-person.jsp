<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="addpersonform"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add person</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<addpersonform:form action="addpersons" method="post"
				modelAttribute="addperson">
				<div>
					<label for="userId">User Id</label>
				</div>
				<div>
					<addpersonform:input path="userId" />
				</div>
				<div>
					<label for="userName">User Name</label>
				</div>
				<div>
					<addpersonform:input path="userName" />
				</div>
				<div>
					<label for="userDob">User Dob </label>
				</div>
				<div>
					<addpersonform:input path="userDob" />
				</div>
				<div>
					<label for="gender">Gender</label>
				</div>
				<div>
					<addpersonform:input path="gender" />
				</div>
				<div>
					<label for="email">Email</label>
				</div>
				<div>
					<addpersonform:input path="email" />
				</div>
				<div>
					<label for="phoneNumber">Phone Number</label>
				</div>
				<div>
					<addpersonform:input path="phoneNumber" />
				</div>
				<div>
					<label for="doorNumber">Door Number</label>
				</div>
				<div>
					<addpersonform:input path="doorNumber" />
				</div>
				<div>
					<label for="street">Street</label>
				</div>
				<div>
					<addpersonform:input path="street" />
				</div>
				<div>
					<label for="pinCode">Pin Code</label>
				</div>
				<div>
					<addpersonform:input path="pinCode" />
				</div>
				<div>
					<label for="passWord">Pass Word</label>
				</div>
				<div>
					<addpersonform:input path="passWord" />
				</div>
				<div>
					<addpersonform:button>Add Person</addpersonform:button>
				</div>
			</addpersonform:form>
		</div>
	</div>
</body>
</html>