<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.yash.model.CRUDModel, com.yash.dao.CRUDDao, java.util.List, java.io.PrintWriter" %>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="ISO-8859-1">
	<title>DELETE</title>
	<link rel="stylesheet" href="css/showstyle.css">
	<link rel="stylesheet" href="css/headerstyle.css">
	<link rel="stylesheet" href="css/all.css">
</head>

<body>
	<div class="header-1">
		<div class="header-options">
			<a href="index.jsp">
				<div class="header-home"><i class="fa-solid fa-house"></i></div>
			</a>
		</div>
		<div class="header-options">
			<a href="addEmp.jsp">
				<div class="header-options-css"><i class="fa-solid fa-c "></i></div>
			</a>
			<a href="showEmp.jsp">
				<div class="header-options-css"><i class="fa-solid fa-r"></i></div>
			</a>
			<a href="updateEmp.jsp">
				<div class="header-options-css"><i class="fa-solid fa-u"></i></div>
			</a>
			<a href="deleteEmp.jsp">
				<div class="header-options-css"><i class="fa-solid fa-d"></i></div>
			</a>
		</div>
	</div>
	<div class="employee-form">
		<div class="form-header">
			<h1>DELETE EMPLOYEE</h1>
		</div>
		<div class="employee-form-body">
			<% List<CRUDModel> list = CRUDDao.getAllEmployees();
				response.setContentType("text/html");
				out.print("<table>");
				out.print("<tr><th>Name</th><th>Email</th><th>Operation</th>");
				for (CRUDModel crudModel : list){
					out.print("<tr><td>"+crudModel.getName()+"</td><td>"+crudModel.getEmail()+"</td></td><td><a href='delete?id="+crudModel.getId()+"'>Delete</a></td></tr>");
				}
				out.print("</table>");
			%>
		</div>
	</div>
</body>

</html>