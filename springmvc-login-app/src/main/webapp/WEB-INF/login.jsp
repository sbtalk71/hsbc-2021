<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
	<h1>Login Page</h1>
	<form action="processLogin" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="username"></td>
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
</body>
</html>