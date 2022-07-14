<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="ISO-8859-1">
	<title>CRUD</title>
	<link rel="stylesheet" href="css/indexstyle.css">
</head>
<body>
	<h1 class="header">CRUD OPERATION</h1>
	<div class="operation-list">
		<div class="operation create">
			<h1 class="operation-header">
				<a href="addEmp.jsp" id="operation-name">C</a>
			</h1>
		</div>
		<div class="operation read">
			<h1 class="operation-header">
				<a href="showEmp.jsp" id="operation-name">R</a>
			</h1>
		</div>
		<div class="operation update">
			<h1 class="operation-header">
				<a href="updateEmp.jsp" id="operation-name">U</a>
			</h1>
		</div>
		<div class="operation delete">
			<h1 class="operation-header">
				<a href="deleteEmp.jsp" id="operation-name">D</a>
			</h1>
		</div>
	</div>
</body>
</html>