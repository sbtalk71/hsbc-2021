<%@page import="com.hsbc.jdbc.entity.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Employees</title>
</head>
<body>
	<%
	List<Emp> empList = (List<Emp>) session.getAttribute("list");
	if (empList.size() > 0) {
	%>
	<table>
		<thead>
			<tr>
				<th>EmpId</th>
				<th>Name</th>
				<th>City</th>
				<th>DOJ</th>
				<th>Salary</th>
			</tr>
			<% for(Emp e:empList){%>
			<tr>
				<td><%=e.getEmpId() %></td>
				<td><%=e.getName() %></td>
				<td><%=e.getCity() %></td>
				<td><%=e.getDoj() %></td>
				<td><%=e.getSalary() %></td>
			</tr>
			<%} %>
		</thead>
	</table>
	<%
	}
	%>
	<a href="index.jsp">Go to Main page</a>
</body>
</html>