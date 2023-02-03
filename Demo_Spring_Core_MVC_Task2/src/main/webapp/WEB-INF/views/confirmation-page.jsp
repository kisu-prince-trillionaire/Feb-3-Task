<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
	<h1>
		<p>Your reservation is confirmed successfully. Please, re-check
			the details.</p>
		First Name : ${reservation.firstName} <br> Last Name :
		${reservation.lastName} <br> Gender: ${reservation.gender} <br><br>
		Meals:
		<ul>
			<c:forEach var="meal" items="${reservation.food}">
				<li>${meal}</li>
			</c:forEach>
		</ul>
		<br> Leaving From : ${reservation.cityFrom} <br> Going To :
		${reservation.cityTo}
	</h1>
</body>
</html>
