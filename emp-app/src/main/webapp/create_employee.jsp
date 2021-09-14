<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Emp</title>
</head>
<body>
	<h2>Insert An Employee</h2>
	<form action="insertEmp" method="get">
		<table>
			<tr>
				<td>Emp Id</td>
				<td><input type="text" name="empId"></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>DOJ(yyyy-mm-dd)</td>
				<td><input type="text" name="doj"></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="text" name="salary"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Insert"></td>
			</tr>
		</table>
	</form>
	<a href="index.jsp">Go to Main page</a>
</body>
</html>