<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.hsbc.web.Authenticator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	<hr>
	<form action="#">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Login"></td>
			</tr>
		</table>
	</form>
	<%
	
	String user = request.getParameter("name");
	String pwd = request.getParameter("password");
	if (user == null || pwd == null) {
	%>
	<jsp:include page="error.jsp" />
	<%
	} else {
	%>
	<%
		Authenticator auth= new Authenticator();
		boolean authenticated=auth.login(user, pwd);
		if(authenticated){
	%><jsp:forward page="success.jsp" />
	
	<%}else{ %>
	<jsp:forward page="failure.jsp" />
	<%}} %>
</body>
</html>