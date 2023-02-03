<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
	<h1>
		<p>Your reservation is confirmed successfully. Please, re-check
			the details.</p>
		First Name : ${reservation.firstName} <br> Last Name :
		${reservation.lastName} <br> Gender: ${reservation.gender}
	</h1>
</body>
</html>
