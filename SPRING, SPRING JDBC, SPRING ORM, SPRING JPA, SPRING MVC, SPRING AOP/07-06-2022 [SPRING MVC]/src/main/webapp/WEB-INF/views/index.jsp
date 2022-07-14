<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	This is Index
	<%
		String name = (String) request.getAttribute("name");
		List<String> list = new ArrayList<String>();
		list.add(name);
	%>
	<h1>name is <%=name%></h1>
	<h1>name is <%=list.toString()%></h1>
</body>
</html>