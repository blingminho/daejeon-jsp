<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String msg = "trust";
	String userId = request.getParameter("userId");
	String password = request.getParameter("password");
%>
<h1>request.getMethod() : <%=request.getMethod() %></h1>
<h1>request.getLocalAddr() : <%=request.getLocalAddr() %></h1>
<h1>request.getRemoteAddr() : <%=request.getRemoteAddr() %></h1>
<h1>request.getContextPath() : <%=request.getContextPath() %></h1>
<h2>userId : <%=userId %></h2> 
<h2>password : <%=password %></h2><br>




</body>
</html>