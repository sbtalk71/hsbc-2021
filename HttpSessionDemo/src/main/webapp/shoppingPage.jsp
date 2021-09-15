<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to ABC Shopping</h1>
	<a href="view_cart.jsp">View Cart</a>
	<hr>
	<form action="cartServlet" method="post">
		<table>
			<tr>
				<td>Item Name</td>
				<td><input type="text" name="itemName"></td>
			</tr>
			<tr>
				<td>Item Price</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Next>>"></td>
			</tr>
		</table>
	</form>
</body>
</html>