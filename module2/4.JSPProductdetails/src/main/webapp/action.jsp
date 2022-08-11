<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String  name=request.getParameter("name");
String  desc=request.getParameter("description");
String  price=request.getParameter("price");
String  quant=request.getParameter("available");
	
%>

<h3>Successfully Added.....!!</h3>

<h4> <b>Name:</b><%=name%></h4>
<h4> <b>Description:</b><%=desc %></h4>
<h4> <b>Price:</b><%=price %></h4>
<h4> <b>Available Quantity:</b><%=quant %></h4>



</body>
</html>