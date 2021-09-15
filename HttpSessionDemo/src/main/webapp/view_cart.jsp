<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach var="item" items="${cart}">
			<tr>
				<td><c:out value="${item.itemName}" /></td>
				<td><c:out value="${item.price}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>