<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <% out.print("Welcome to JSP Demo"); %>
<%! int a=100; %>
<%= a %>
<%! 
	int abc(int n) {
		return n*n;
	}
%>
<%= "Square of 2 = "+abc(2) %> --%>

<%-- <% 
	int a = 5;
	for(int i=1; i<=10; i++) {
		out.println(a+"*"+i+"="+a*i);
	}
%> --%>

<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  

<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  

<%   
response.sendRedirect("http://www.google.com");  
%>

<%   
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>   

Today's date: <%= (new java.util.Date()).toLocaleString()%>
</body>
</html>