<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Employee</title>
</head>
<body>
	<h1>Emp Finder Page</h1>
	<hr>
	<form action="findEmp">
		<span>ID</span> <input type="text" name="empId"> <input
			type="submit" value="Find">
	</form>
	<hr>
	
	<table>
		<tr>
			<td>EmpId</td>
			<td><c:out value="${emp.empId}" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><c:out value="${emp.name}" /></td>
		</tr>
		<tr>
			<td>City</td>
			<td><c:out value="${emp.city}" /></td>
		</tr>
		<tr>
			<td>DOJ</td>
			<td><c:out value="${emp.doj}" /></td>
		</tr>
		<tr>
			<td>Salary</td>
			<td><c:out value="${emp.salary}" /></td>
		</tr>
	</table>

	<a href="index.jsp">Go to Main page</a>
</body>
</html>