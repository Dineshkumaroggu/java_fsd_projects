<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Students</title>
</head>
<body >

	<jsp:include page="left-list.jsp" />
				<center>
				<h3>Students</h3>

				<table>

					<tr>

						<th>First Name</th>
						<th>Last Name</th>
						<th>age</th>
						

					</tr>

					<c:forEach var="tempStudent" items="${STUDENT_LIST}">
						<tr>

							<td>${tempStudent.fname}</td>
							<td>${tempStudent.lname}</td>
							<td>${tempStudent.age}</td>

						</tr>

					</c:forEach>

				</table>
				</center>
</body>
</html>