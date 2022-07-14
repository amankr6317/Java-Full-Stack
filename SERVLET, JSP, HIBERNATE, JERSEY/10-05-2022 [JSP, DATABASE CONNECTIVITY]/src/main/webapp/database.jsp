<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<html>
<head>
<title>Connection with mysql database</title>
</head>
<body>
	<h1>Connection status</h1>
	<%
	try {

		String connectionURL = "jdbc:mysql://localhost:3306/self";

		Connection connection = null;

		Class.forName("com.mysql.jdbc.Driver");

		connection = DriverManager.getConnection(connectionURL, "root", "Amankumar@1234");
		if (!connection.isClosed())
			out.println("Successfully connected to mysql");
		connection.close();
	} catch (Exception ex) {
		out.println("Unable to connect to database.");
	}
	%>
</body>
</html>