<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome, <%=request.getSession().getAttribute("userName") %></h2>
<br>
<p>This is the home page </p>

<p> Click here to go to the next page <a href = "<%=request.getContextPath()%>/next.do"> Here</a> </p>
</body>
</html>