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
    String fname = request.getParameter("firstName");
    out.println("Firstname: " + fname);
    String lname = request.getParameter("lastName");
	out.println("Lastname: " + lname);
	String[] values = request.getParameterValues("hobbie");
	if (values!=null) {
		for (String val: values) {
			out.println("Value "+ val);
		}
	}
%>
</body>
</html>