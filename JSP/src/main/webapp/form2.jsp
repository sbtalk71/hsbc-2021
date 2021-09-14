<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.hsbc.web.util.ConcatService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Concat Service</h1>
	<hr>
	<form action="#">
		<table>
			<tr>
				<td>Enter 1st word</td>
				<td><input type="text" name="word1"></td>
			</tr>
			<tr>
				<td>Enter 2nd word</td>
				<td><input type="text" name="word2"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Do Concat"></td>
			</tr>
		</table>
	</form>
	<hr>
	<%
	ConcatService service = new ConcatService();
	String word1 = request.getParameter("word1");
	String word2 = request.getParameter("word2");
	if (word1 == null || word2 == null) {
	%>
	<jsp:include page="error.jsp"/>
	<%
	} else {
	%>
	<h1>
		Result-1:
		<%=service.doConcat(word1, word2)%></h1>

	<h1>
		Result-2:
		<%=doJoin(word1, word2)%></h1>
	<%
	}
	%>

	<%!public String doJoin(String s1, String s2) {
		return s1 + " " + s2;
	}%>
</body>
</html>