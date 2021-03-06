<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Employees</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>EmpId</th>
				<th>Name</th>
				<th>City</th>
				<th>DOJ</th>
				<th>Salary</th>
			</tr>
			<c:forEach var="emp" items="${list}">
				<tr>
					<td><c:out value="${emp.empId}" /></td>
					<td><c:out value="${emp.name}" /></td>
					<td><c:out value="${emp.city}" /></td>
					<td><c:out value="${emp.doj}" /></td>
					<td><c:out value="${emp.salary}" /></td>
				</tr>
			</c:forEach>
		</thead>
	</table>

	<a href="index.jsp">Go to Main page</a>
</body>
</html>