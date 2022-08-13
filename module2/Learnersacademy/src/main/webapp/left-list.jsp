<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<center >
	<h3 >
		Administrative Academy Portal
	</h3>
	<c:url var="classesLink" value="AdminControllerServlet">
		<c:param name="command" value="CLASSES" />
	</c:url>

	<c:url var="subjectsLink" value="AdminControllerServlet">
		<c:param name="command" value="SUBJECTS" />
	</c:url>

	<c:url var="teachersLink" value="AdminControllerServlet">
		<c:param name="command" value="TEACHERS" />
	</c:url>

	<c:url var="studentsLink" value="AdminControllerServlet">
		<c:param name="command" value="STUDENTS" />
	</c:url>
	
 

 
 	 
	
	   <a href="${classesLink}">Classes</a> 
		<a  href="${subjectsLink}">Subjects</a>
		<a  href="${teachersLink}">Teachers</a> 
		<a href="${studentsLink}">Students</a> 
		<a href="login.jsp">Log out</a>

</center>

