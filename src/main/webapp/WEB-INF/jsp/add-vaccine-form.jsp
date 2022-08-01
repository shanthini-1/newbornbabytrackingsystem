<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="addvaccines" method="post" modelAttribute="addvaccine">
				<div>
					<label for="vaccine_id">Vaccine Id</label>
				</div>
				<div>
					<form:input path="vaccine_id" />
				</div>
				<div>
					<label for="week">Week</label>
				</div>
				<div>
					<form:input path="week" />
				</div>
				<div>
					<label for="vaccine_name">Vaccine Name </label>
					</div>
					<div>
					<form:input path="vaccine_name"/>
					</div>
					<div>
					<label for="vac_description">Description</label>
					</div>
					<div>
					<form:input path="vac_description"/>
					</div>
					<div>
					<label for="dosage">Dosage</label>
					</div>
					<div>
					<form:input path="dosage"/>
					</div>
					<div>
					<label for="suggestion">Suggestion</label>
					</div>
					<div>
					<form:input path="suggestion"/>
					</div>
					<div>
					<label for="vaccine_price">Vaccine price</label>
					</div>
					<div>
					<form:input path="vaccine_price"/>
					</div>
					<div>
					<form:button>Add Vaccine</form:button></div>
			</form:form>
		</div>
	</div>
</body>
</html>