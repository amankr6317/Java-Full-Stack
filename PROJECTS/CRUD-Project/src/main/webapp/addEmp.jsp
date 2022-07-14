<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="ISO-8859-1">
	<title>ADD</title>
	<link rel="stylesheet" href="css/indexstyle.css">
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
			<h1>ADD EMPLOYEE</h1>
		</div>
		<div class="employee-form-body">
			<form action="save" method="post">
				<table>
					<tr>
						<td class="form-head-css" style="display: none;">ID:</td>
						<td><input type="text" name="id" class="form-input-css" style="display: none;" /></td>
					</tr>
					<tr>
						<td class="form-head-css">Name:</td>
						<td><input type="text" name="username" class="form-input-css" required /></td>
					</tr>
					<tr>
						<td class="form-head-css">Password:</td>
						<td><input type="password" name="password" class="form-input-css" required /></td>
					</tr>
					<tr>
						<td class="form-head-css">Email:</td>
						<td><input type="email" name="email" class="form-input-css" required /></td>
					</tr>
				</table>
				<div class="form-footer">
					<input type="submit" value="Save Employee" class="form-button" />
				</div>
			</form>
		</div>
	</div>
</body>

</html>