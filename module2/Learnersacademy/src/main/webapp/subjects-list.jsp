<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Teachers</title>
</head>
<body >
		<jsp:include page="left-list.jsp" />

				<center>
				<h3>Subjects</h3>
	
				<table>

					<tr>

						<th>Name</th>
						<th>Shortcut</th>
						

					</tr>

					<c:forEach var="tempSubject" items="${SUBJECTS_LIST }">
						<tr>

							<td>${tempSubject.name}</td>
							<td>${tempSubject.shortcut}</td>
				
						</tr>

					</c:forEach>

				</table>
				</center>
</body>
</html>