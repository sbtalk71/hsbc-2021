<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP Class</h1>
	<%=new java.util.Date()%>
	
	<%=request.getMethod() %>
	
	<h1><%out.print("Hello JSP"); %></h1>
</body>
</html>