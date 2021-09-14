<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!public void jspInit() {

		System.out.println("This is jsp Init..");
	}%>
	<%!public void jspDestroy() {

		System.out.println("This is jsp Destroy..");
	}%>
	<%
	out.println("Within Service..");
	%>
</body>
</html>